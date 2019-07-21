package cit360.mvchibernate.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cit360.mvchibernate.model.User;


/* CIT 360
 * @author: RAMON ANDRADE @2019
 * 
 * */

public class LoginServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

	// get data from post servlet
	 String userId = request.getParameter("userId");	
	 String password = request.getParameter("password");
	 
	 UserController loginService = new UserController();
	 
	 boolean result = loginService.authenticateUser(userId, password);
	 
	 // if ok with password and id go to home
	 if(result == true){
		 
		 User user = loginService.getUserByUserId(userId);
		 
		 // save session
		 request.getSession().setAttribute("user", user);		
		 response.sendRedirect("home.jsp");
	 }
	 else{
		 response.sendRedirect("error.jsp");
	 }
}

}