package com.walkin.testProject.DAO;

import java.util.List;

import com.walkin.testProject.model.User;

public interface UserDAO {
	public void insertUser(User user);
	public User getUser(User user);
	public List<User> getAllUsers();
}
