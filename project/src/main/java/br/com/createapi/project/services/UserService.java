package br.com.createapi.project.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.createapi.project.model.User;
import br.com.createapi.project.repository.IUser;

@Service
public class UserService {
	
	private IUser repository;
	
	public UserService(IUser repository) {
		this.repository = repository;
	}
	
	public List<User> listUser() {
		List<User> list = repository.findAll();
		return list;
	}
	
	public User createUser(User user) {
		User newUser = repository.save(user);
		return newUser;
	}
	
	public User editUser(User user) {
		User newUser = repository.save(user);
		return newUser;
	}
	
	public Boolean deleteUser(Integer id) {
		repository.deleteById(id);
		return true;
	}

}
