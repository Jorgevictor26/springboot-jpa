package com.jvcompany.services.service;

import com.jvcompany.services.entities.Category;
import com.jvcompany.services.repositories.CategoryRepository;
import com.jvcompany.services.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        List<Category> categories = repository.findAll();
        return categories;
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
