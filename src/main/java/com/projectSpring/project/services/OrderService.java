package com.projectSpring.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectSpring.project.entities.Order;
import com.projectSpring.project.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepo;
	
	public List<Order> findAll() {
		return orderRepo.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> order = orderRepo.findById(id);
		return order.get();
	}
}
