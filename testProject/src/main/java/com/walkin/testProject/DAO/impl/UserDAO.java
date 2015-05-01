package com.walkin.testProject.DAO.impl;

import javax.sql.DataSource;

import com.walkin.testProject.model.User;

public class UserDAO implements com.walkin.testProject.DAO.UserDAO{
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUsers(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
