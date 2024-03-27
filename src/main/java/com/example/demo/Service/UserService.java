package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.UserDao;
import com.example.demo.Entity.User;

@Service
public class UserService {
  
	
	  @Autowired
	   UserDao user;
      public User getUser(int id)
      {
    	  return user.findById(id);
      }
      public List<User>getAllUsers(){
    	   //user.deleteAll();
    	  List<User>u=user.findAll();
    	   for(User us:u)
    		     System.out.println(us);
    	  return u;
      }
      public User addUser(User u) {
    	     try 
    	     {
    	    	 
    	    	 user.save(u);
    	    	 return u;
    	    	 
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);	
				return null;
			}
    	     
    	    
      }
      
      public User deleteUser(int id)
      {
    	  try {
			
    		   return user.deleteById(id);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
    	  
      }
      public User register(String n,String e,String p) {
    	  User u=new User(n,e,p);
    	 return  user.save(u);
    	  
      }
      public User login(String e,String p) {
     	 User u=  user.findByEmailAndPassword(e, p);
     	  System.out.println(u);
     	  return u;
       }
  
}
