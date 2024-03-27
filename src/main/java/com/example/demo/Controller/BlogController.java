package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.coyote.http11.Http11InputBuffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Post;
import com.example.demo.Entity.User;
import com.example.demo.Service.PostService;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("/blogs")
@CrossOrigin("http://localhost:3000")
public class BlogController {
         @Autowired
           PostService post;
         @Autowired
         UserService user;
	   @GetMapping("/getAllBlogs")
	   public ResponseEntity<Post> getAllBlog() {
		       System.out.println("heelo from get All Blogs	");
		      
		      List<Post>li=  post.getAllBlogs();
		       System.out.println(li.get(0).getUser());
		       
		   return new ResponseEntity(li,HttpStatus.ACCEPTED);
		   
	   }
	   
	   @GetMapping("/getBlog/{id}")
	   public List<Post> getBlogByUserId(@PathVariable("id")int userId){
		   return post.getBlogsByUserId(userId);
	   }
	   @PostMapping("/addBlog")
	   public User addBlog(@RequestBody MyObject myobj) {
		   int userId=myobj.getUserId();

		   
		    User u= user.getUser(userId);
			 //  System.out.println("User:"+userId);
		  Post p=new Post(myobj.getDescription(),myobj.getName(),myobj.getImage(),myobj.getCategory(),u);
		   System.out.println("details"+u+" "+p	);
		     
		     	
		   return post.addBlog(u, p);
		      
		     
		   
	   }
	   @GetMapping("/trendingBlogs")
	    public List<Post>trendingBlogs(){
		   
		   return post.getTrendingBlogs();
		   
	   }
//	   @DeleteMapping("/{id}")
//	   public User deleteUser(@PathVariable("id")int id)
//	   {
//		   return user.deleteUser(id);
//	   }
//	   
}
