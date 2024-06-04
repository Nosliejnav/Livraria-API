package com.vanja.livraria.repository;

import com.vanja.livraria.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro,Long> {

}
