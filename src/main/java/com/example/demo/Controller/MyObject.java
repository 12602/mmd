package com.example.demo.Controller;

import com.example.demo.Entity.User;

public class MyObject 
{
    public MyObject(int userId, String image, String name, String description, User user, String category) {
		super();
		this.userId = userId;
		this.image = image;
		this.name = name;
		this.description = description;
		this.user = user;
		this.category = category;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "MyObject [userId=" + userId + ", image=" + image + ", name=" + name + ", description=" + description
				+ ", user=" + user + ", category=" + category + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private int userId;
    private String image;
    public String name;
    public String description;
    public User user;
    public String category;
    // getters and setters
}
