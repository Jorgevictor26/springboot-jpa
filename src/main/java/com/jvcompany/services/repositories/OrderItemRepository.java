package com.jvcompany.services.repositories;

import com.jvcompany.services.entities.OrderItem;
import com.jvcompany.services.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
