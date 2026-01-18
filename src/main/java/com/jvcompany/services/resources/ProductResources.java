package com.jvcompany.services.resources;

import com.jvcompany.services.entities.Product;
import com.jvcompany.services.entities.User;
import com.jvcompany.services.service.ProductService;
import com.jvcompany.services.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")

public class ProductResources {
    @Autowired
    ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findaAll() {
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findaById(@PathVariable Long id) {
        Product product = service.findById(id);
        return ResponseEntity.ok().body(product);
    }
}
