package com.jvcompany.services.service;

import com.jvcompany.services.entities.Product;
import com.jvcompany.services.entities.User;
import com.jvcompany.services.repositories.ProductRepository;
import com.jvcompany.services.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }
    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
