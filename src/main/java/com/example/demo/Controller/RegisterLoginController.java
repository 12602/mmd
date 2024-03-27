package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@RestController
public class RegisterLoginController {
	 @Autowired
     UserService user;
	 @CrossOrigin(origins = "http://localhost:3000")
  @PostMapping("/user/register")
   public User addUser(@RequestBody User u) {
	           
	     System.out.println("User"+u);
	    return  user.register(u.getUserName(),u.getEmail(),u.getPassword());
	  
	  
  }
	 @CrossOrigin(origins = "http://localhost:3000")
	 @PostMapping("/user/login")
  public User loginUser(@RequestBody User u)
  {
	    	   System.out.println("User"+u);
		   return  user.login(u.getEmail(), u.getPassword());
		   
	  
  }
}
