package com.projectSpring.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectSpring.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
