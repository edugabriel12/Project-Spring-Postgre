package com.projectSpring.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projectSpring.project.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Eduardo", "gabriel123@gmail.com", "4002-8922", "123");
		return ResponseEntity.ok().body(u);
	}

}
