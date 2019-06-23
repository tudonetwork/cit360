package main;

import java.util.HashMap;


public class Leads {

	private HashMap<String, String> datos = new HashMap<String, String>();
	private String listLeads  = "";
	private String keySearch;
	
	public void setData(String name, String email) {
		
		// Capitalized the name
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
	
		this.datos.put(name, email);
	}


	public String getData(String key) {
		
		listLeads = "";
		
		// Capitalized the name
		keySearch = key.substring(0, 1).toUpperCase() + key.substring(1);
		
		
		// Search by name and starts with "key"
		datos.entrySet().stream().filter(e -> e.getKey().startsWith(keySearch)).forEach(e -> {
			listLeads += "Name: " + e.getKey() + " | Email: " + this.datos.get(e.getKey()) + "\n";
	    });
		
		return (listLeads=="") ? "Nothing found...": listLeads;

	}
	

	public String getAllLeades() {
		
		listLeads = "";
		
		datos.forEach((k,v) -> { 
			listLeads += "Name: " + k + " | Email: "+ v + "\n";
		});
		 
		return (listLeads=="") ? "Nothing found...": listLeads;
		 
	}
	
	
	public String deleteData(String info) {
		
		
		if(datos.containsKey(info)) {
			
			datos.remove(info);
			
			return "Successfully deleted";
			
		}else if(datos.containsValue(info)) {
			
			datos.values().remove(info);
			
			return "Successfully deleted";
			
		}else {
		
			return "Nothing found...";
		
		}
	}

}
