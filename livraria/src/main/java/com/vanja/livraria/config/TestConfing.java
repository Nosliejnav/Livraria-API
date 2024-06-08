package com.vanja.livraria.config;

import com.vanja.livraria.entity.Autor;
import com.vanja.livraria.entity.Livro;
import com.vanja.livraria.repository.AutorRepository;
import com.vanja.livraria.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
//@Profile("test")

public class TestConfing implements CommandLineRunner{
    @Autowired
    private LivroRepository livroRepository;

    @Autowired
    private AutorRepository autorRepository;

    @Override
    public void run(String... args) throws Exception {

       Autor a1 = new Autor(null, "Carlos");
       Autor a2 = new Autor(null, "Rony");

       autorRepository.saveAll(Arrays.asList(a1,a2));

       Livro l1 = new Livro(null, "Senhor dos Aneis",a1);
       Livro l2 = new Livro(null, "Codigo Limpo", a2);

       livroRepository.saveAll(Arrays.asList(l1,l2));

    }
}
