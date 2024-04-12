package com.devsuperior.dscommerce.repositories;

import com.devsuperior.dscommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
