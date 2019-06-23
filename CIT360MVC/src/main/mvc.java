package main;

import java.util.Scanner;


public class mvc {
	
	   public static void main(String[] args) {
		   
		  Scanner read = new Scanner(System.in);
		   
		  String menu = "\n\n\n----------MENU---------\n(A) Add a new Lead\n(R) Retrive all Leads\n(S) Search\n(D) Delete";
		  String UserName = "";
		  String menuOpt = "";
		  
		  
		  // User
		  Users model  = new Users();
	      UsersView view = new UsersView();
	      UsersController controller = new UsersController(model, view);
	      
		  
		  System.out.println("##### BYU LEADS CRM #####\n");
		  
		  System.out.println("What is your name?");
		  UserName = read.nextLine();  
		 
		  // Save in the model 
	      controller.setUserName(UserName);
		  
		  System.out.println("Welcome "+ UserName + "!\n");
		  
		  // Leads
	      Leads modelLead  = new Leads();

	      LeadsView viewLead = new LeadsView();
	      
	      LeadsController controllerLead = new LeadsController(modelLead, viewLead);
	      
	      controllerLead.setLeadDatos("Ramon Andrade", "ramon@yahoo.com");
	      controllerLead.setLeadDatos("Jessica Andrade", "jessica@gmail.com");
	      controllerLead.setLeadDatos("Katherine Nunes", "katenunes@yahoo.com");
	      controllerLead.setLeadDatos("Hannah Silva", "hannakelly@gmail.com");
	     
		  
		  do{
			  
			  System.out.println(menu);
			  menuOpt = read.nextLine();

		      switch (menuOpt) {
	            case "A":
	            case "a":
	            	
	            	System.out.println("\n\nAdding a new lead -------------");
	            	 
	            	System.out.println("Name:");
	       		 	String cname = read.nextLine();  
	       		  
	       		 	System.out.println("Email:");
	       		 	String email = read.nextLine(); 
	       		  
	       		 	controllerLead.setLeadDatos(cname, email);
	       		 
	            break;
	            case "R":
	            case "r":
	            	
	            	controllerLead.GetAllLeades();
	            	  
	            break;
	            
	            
	            case "S":
	            case "s":
	            	
	            	System.out.println("\n\n---- Search (type the name):");
	       		 	String name = read.nextLine(); 
	       		  
	       		 	controllerLead.getLeadbyName(name);
	       		 
	            break;
	            
	            case "D":
	            case "d":
	            	
	            	System.out.println("\n\n---- Delete (type the name or email):");
	       		 	String data = read.nextLine(); 
	       		  
	       		 	controllerLead.deleteLead(data);
	       		 
	            break;
	
	          } // end of switch
	            

		  }while(menuOpt!="0");
	     

	     
	   }
	   
	}