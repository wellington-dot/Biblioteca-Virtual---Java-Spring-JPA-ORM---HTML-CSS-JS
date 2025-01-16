package com.RodriTech.books.repository;

import com.RodriTech.books.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
