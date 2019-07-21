package cit360.mvchibernate.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import cit360.mvchibernate.controller.LeadController;
import cit360.mvchibernate.model.Lead;

public class LeadTest {
	
	String phone = "(200)123456789";
	String country = "Brasil";
	
	// Testing Model
	@Test
	public void testCompareData() {
		 
		 String fname = "Testing";
		 
		 Lead lead = new Lead(fname, "Tester", "testing@yahoo.com", phone, country);
		 
		 String name = lead.getFirstName();	
		
		 assertEquals(fname, name);
		 //assertNotEquals("ERROR, NOT EQUAL OR SAME", fname, name);
	}
	
	
	// Testing Model - comparing all data
	@Test
	public void testCompareAllData() {
		
		 String[] data1 = {"Testing", "Tester", "testingarray@yahoo.com", "123 456 789", "USA"};
		 			 
		 Lead lead = new Lead(data1[0], data1[1], data1[2], data1[3], data1[4]);
		 
		 String[] data2 = {lead.getFirstName(), lead.getLastName(), lead.getEmail(), lead.getPhoneNumber(), lead.getCountry()};	
		
		 assertArrayEquals(data1, data2);
	}
		
	
	
	// Testing Model
	@Test
	public void testInstanceLead() {
	
	 Lead lead = new Lead("Ramon", "Andrade", "ramon123@yahoo.com", phone, country);
	 
	 // Lead Model returned an object
	 assertNotNull(lead); 
	 
	}
	
	// Testing Controller
	@Test
	public void testIsLeadExists() {
	
		LeadController leadService = new LeadController();
		
		Lead lead = new Lead("Testing","Testers", "ramon123@yahoo.com", phone, country);
		
		boolean result = leadService.isLeadExists(lead);		
		
		assertFalse("Already EXIST", result);
	
	}
	
	// Testing Controller
	@Test
	public void testRegister() {
			
		LeadController leadService = new LeadController();
		 
		 Lead lead = new Lead("Ramon","Andrade", "ramon123@yahoo.com", phone, country);
		 
		 boolean result = leadService.register(lead);	
		
		 assertTrue("Registration ERROR", result);
	}

	
	
	
	

}
