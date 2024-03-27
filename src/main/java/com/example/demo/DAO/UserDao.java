package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.User;

@Controller
public interface UserDao extends JpaRepository<User, Integer>{
	
	public User findById(int id);
	public User findByEmailAndPassword(String email,String password);
	public List<User> findAll();
	public User deleteById(int id);

}
