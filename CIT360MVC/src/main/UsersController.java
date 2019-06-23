package main;

public class UsersController {
	
	private Users model;
	  private UsersView view;

	   public UsersController(Users model, UsersView view){
	      this.model = model;
	      this.view = view;
	   }

	   public void setUserName(String name){
	      model.setName(name);		
	   }

	   public String getUserName(){
	      return model.getName();		
	   }
	   
	   public void setUserNumber(String name){
	      model.setNumber(name);		
	   }

	   public String getStudenNumber(){
	      return model.getNumber();		
	   }


	   public void updateView(){				
	      view.printUserDetails(model.getName());
	   }	

}
