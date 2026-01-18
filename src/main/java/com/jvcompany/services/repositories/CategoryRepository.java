package com.jvcompany.services.repositories;

import com.jvcompany.services.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
