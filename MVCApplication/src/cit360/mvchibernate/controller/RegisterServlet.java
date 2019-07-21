package cit360.mvchibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cit360.mvchibernate.model.Lead;


/* CIT 360
 * @author: RAMON ANDRADE @2019
 * 
 * */

public class RegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
	 response.setContentType("text/html;charset=UTF-8");
	 
	 // Registering a new lead
	 PrintWriter out = response.getWriter();
	 String firstName = request.getParameter("firstName");
	 String lastName = request.getParameter("lastName");
	 String email = request.getParameter("email");
	 String phonenumber = request.getParameter("phonenumber");
	 String country = request.getParameter("country");
	 Lead lead = new Lead(firstName,lastName, email, phonenumber,country);
			
	 try {	
		 LeadController registerService = new LeadController();
		 boolean result = registerService.register(lead);		
		 out.println("<html>");
		 out.println("<head>");		
		 out.println("<title>Lead added Successfuly</title>");		
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<center>");
		 if(result){
			 out.println("<h1>Lead added Successfuly</h1>");
			 out.println("Return to lead managment <a href=home.jsp>Click here</a>");
		 }else{
			 out.println("<h1>Error, already exist a lead with same email.</h1>");
			 out.println("To try again <a href=register.jsp>Click here</a>");
		 }
		 out.println("</center>");
		 out.println("</body>");
		 out.println("</html>");
	 } finally {		
		 out.close();
	 }
}

}