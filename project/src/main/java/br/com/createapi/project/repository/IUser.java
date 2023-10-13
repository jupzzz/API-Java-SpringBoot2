package br.com.createapi.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.createapi.project.model.User;

public interface IUser extends JpaRepository<User, Integer>{

}
