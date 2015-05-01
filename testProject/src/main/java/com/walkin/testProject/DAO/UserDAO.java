package com.walkin.testProject.DAO;

import com.walkin.testProject.model.User;

public interface UserDAO {
	public void insertUser(User user);
	public User getUsers(User user);
}
