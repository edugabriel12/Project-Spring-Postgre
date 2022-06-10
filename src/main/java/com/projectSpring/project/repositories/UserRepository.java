package com.projectSpring.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectSpring.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
