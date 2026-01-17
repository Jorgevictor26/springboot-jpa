package com.jvcompany.services.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "FK_client")
    private User client;

    public Order() {
    }

    public Order(User client, Instant moment, Long id) {
        this.client = client;
        this.moment = moment;
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public Long getId() {
        return id;
    }

    public User getClient() {
        return client;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
