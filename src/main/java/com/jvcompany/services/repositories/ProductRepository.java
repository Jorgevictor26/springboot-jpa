package com.jvcompany.services.repositories;

import com.jvcompany.services.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
