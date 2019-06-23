package main;

public class LeadsController {

	   private Leads model;
	   private LeadsView view;
	   
	   // Constructor
	   public LeadsController(Leads model, LeadsView view){
	      this.model = model;
	      this.view = view;
	   }

	   public void setLeadDatos(String name, String grade){
	      model.setData(name, grade);	
	       
	   }

	   public void getLeadbyName(String Leadname){
		   view.printLeadDetails(model.getData(Leadname));
	   }
	   
	   
	   public void GetAllLeades(){				
		   view.printLeadDetails(model.getAllLeades());
	   }
	   
	   public void deleteLead(String info){
		   view.printInfo(model.deleteData(info));
	   }


	   
}
