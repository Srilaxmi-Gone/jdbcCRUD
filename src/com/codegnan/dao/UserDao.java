package com.codegnan.dao;

import java.util.List;

import com.codegnan.entity.User;

public interface UserDao {
	public void addUser(User user);
	
	//to add user
	//toi get user by id
	public User getUserById(int id);
	
	
	//to get all users
	public List<User> getAllUsers();
	
	//to update users data
	public void updateUser(User user);
	
	//delete data by id
	public void deleteUser(int id);
	

}
