package com.example.demo.Entity;



import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Post{
	public Post(String description, String name, String image, String category, User user) {
		super();
		this.description = description;
		this.name = name;
		this.createdAt = createdAt;
		this.image = image;
		this.category = category;

		this.user = user;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Post [description=" + description + ", name=" + name + ", createdAt=" + createdAt + ", image=" + image
				+ ", category=" + category + ", postId=" + postId + ", user=" + user + "]";
	}

	public Post() {
		
	}

	public Post(String description, String name, String image, User user) {
		super();
		this.description = description;
		this.name = name;
		this.image = image;
		this.user = user;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User u) {
		this.user = u;
	}
	
	
	 public String description;
	 public String name;
	   @CreationTimestamp
	    @Temporal(TemporalType.TIMESTAMP)
	    @Column(name = "created_at", nullable = false, updatable = false)
	    private Date createdAt;
	 public String image;
	 public String category;
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
		private int postId;

	    @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "userId")
//	    @JsonIgnore	
		  
	  User user;
	 


   
}
