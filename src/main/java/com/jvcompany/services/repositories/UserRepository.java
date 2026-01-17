package com.jvcompany.services.repositories;

import com.jvcompany.services.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
