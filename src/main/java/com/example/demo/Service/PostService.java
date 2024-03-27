package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Controller.MyObject;
import com.example.demo.DAO.BlogDao;
import com.example.demo.DAO.UserDao;
import com.example.demo.Entity.Post;
import com.example.demo.Entity.User;

@Service
public class PostService {

	 @Autowired
	BlogDao blog;
	 @Autowired
	 UserDao user;
	 
	 public User addBlog(User u,Post p)
	 {
		 try {
			     System.out.println("User"+u+"Post"+p);
			   u.getPosts().add(p);
			   user.save(u);
			   
			   return u;
			
		}
		 catch (Exception e) {
			// TODO: handle exception
			 System.out.println(e);
	    return null;
		}
		 
		  
	 }
	  public List<Post> getBlogsByUserId(int userId)
	  {
		  try {
				 User u=user.findById(userId);
				  
				  
				  
				   return u.getPosts();
				
			} catch (Exception e) {
				// TODO: handle exception
				 System.out.println(e);
		    return null;
			}
		 
	  }
	  public List<Post> getAllBlogs()
	  {
		  try {
				
			  
			  
			         
				  //List<MyObject>allBlogs= blog.findAll();
				  List<Post>allBlogs=blog.findAll();
			          //System.out.println(allBlogs.get(0).getUser());
			        for(Object p:allBlogs)
			        {
			        	System.out.println("Record");
			        	 
			        	  
			        	  
			        }
				//  System.out.println("All Blogs");
				  //System.out.println(allBlogs);	
				  return allBlogs;
				  
				
			} catch (Exception e) {
				// TODO: handle exception
				 System.out.println(e);
		        return null;
			}
		 
	  }
	  public List<Post> getTrendingBlogs(){
		  List<Post	>li=new ArrayList<>();
		  	
		  return li;
	  }
 
}
