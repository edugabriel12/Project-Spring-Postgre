package com.projectSpring.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectSpring.project.entities.Category;
import com.projectSpring.project.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepo;
	
	public List<Category> findAll() {
		return categoryRepo.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> user = categoryRepo.findById(id);
		return user.get();
	}
}
