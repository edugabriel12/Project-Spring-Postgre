package com.projectSpring.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectSpring.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
