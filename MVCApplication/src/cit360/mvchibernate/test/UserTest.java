package cit360.mvchibernate.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cit360.mvchibernate.controller.UserController;
import cit360.mvchibernate.model.User;

public class UserTest {

	@Test
	public void testAuthenticateUser() {
	
	// TESTING Controller
	 UserController loginService = new UserController();
	 
	 boolean result = loginService.authenticateUser("admin", "admin");
	 
	 // if true logged!
	 assertTrue(result);
		 
	}
	
	// TESTING Controller
	@Test
	public void testGetUserByUserId() {
	
	 // Testing getting user info
		
	 UserController loginService = new UserController();
	 
	 User user = loginService.getUserByUserId("admin");
	
	 // Get user information
	 assertNotNull(user);
		 
	}
	
	// TESTING Model
	@Test
	public void testLoginData() {
	
	 // Testing getting user info
		
	 User user = new User("Ramon", "Andrade", "admin", "admin");
	 
	 assertSame("Ramon", user.getFirstName());
		 
	}


}
