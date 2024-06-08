package com.vanja.livraria.service;

import com.vanja.livraria.entity.Autor;
import com.vanja.livraria.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {
    @Autowired
    private AutorRepository repository;
    
    public Autor create(Autor obj){
       return repository.save(obj);
    }
    
    public void delete(Long id){
        repository.deleteById(id);
    }
    
    public Autor getId(Long id){
        Optional<Autor> obj = repository.findById(id);
        return obj.get();
    }
    
    public List<Autor>getAll(){
        return repository.findAll();
    }
    
    public Autor update(Autor obj){
        Optional<Autor> newObj = repository.findById(obj.getId());
        updateAutor(newObj, obj);
        return repository.save(newObj.get());

    }
    private void updateAutor(Optional<Autor> newObj, Autor obj) {
        newObj.get().setNome(obj.getNome());
    }
}