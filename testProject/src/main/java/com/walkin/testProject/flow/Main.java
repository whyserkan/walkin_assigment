package com.walkin.testProject.flow;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.walkin.testProject.DAO.UserDAO;
import com.walkin.testProject.model.User;



public class Main {
	
	 public static void main( String[] args )
	    {
	    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
	    	 
	        UserDAO userDAO = (UserDAO) context.getBean("userDAO");
	    	
	        List<User> userList = userDAO.getAllUsers();
	        
	        for (User user : userList) {
				System.out.println("userName: "+ user.getUserName());
				System.out.println("role: "+ user.getRole());
			}
	        
	    }
}
