package com.walkin.testProject.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	public User getUser(User user) {
		String sql = "SELECT * FROM USER WHERE USER_NAME=?";
		
		Connection conn = null;
		User retUser = new User();
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUserName());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				
				retUser = new User(rs.getString("user_name"),rs.getString("pass"),rs.getString("role"));
				
			} 
			
			rs.close();
			ps.close();
			return retUser;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {e.printStackTrace();}
			}
		}
	}
	
	@Override
	public List<User> getAllUsers() {
		
		String sql = "SELECT * FROM USER";
		
		Connection conn = null;
		List<User> users = new ArrayList<User>();
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				
				User user = new User(rs.getString("user_name"),rs.getString("pass"),rs.getString("role"));
				users.add(user);
				
			} 
			
			rs.close();
			ps.close();
			return users;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
		
	}

}
