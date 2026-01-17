package com.jvcompany.services.repositories;

import com.jvcompany.services.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
