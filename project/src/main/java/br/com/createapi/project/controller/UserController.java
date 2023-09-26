package br.com.createapi.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.createapi.project.DAO.IUser;
import br.com.createapi.project.model.User;

@RestController
public class UserController {
	
	@Autowired
	private IUser dao;

	@GetMapping("/user")
	public List<User> userList() {
		return (List<User>) dao.findAll();
	}
}
