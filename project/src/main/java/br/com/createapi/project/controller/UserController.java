package br.com.createapi.project.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.createapi.project.model.User;
import br.com.createapi.project.services.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
	
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	public ResponseEntity<List<User>> userList() {
		return ResponseEntity.status(200).body(userService.listUser());
	}
	
	@PostMapping
	public ResponseEntity<User> createUser (@RequestBody User user) {
		return ResponseEntity.status(201).body(userService.createUser(user));
	}
	
	@PutMapping
	public ResponseEntity<User> editUser (@RequestBody User user) {
		return ResponseEntity.status(200).body(userService.editUser(user));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUser (@PathVariable Integer id) {
		userService.deleteUser(id);
		return ResponseEntity.status(204).build();
	}
}
