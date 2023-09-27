package br.com.createapi.project.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.createapi.project.model.User;

public interface IUser extends CrudRepository<User, Integer>{

}
