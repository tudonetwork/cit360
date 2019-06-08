package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/* @descrip: Class to use Threads, Executors, Runnables, HTTP Request, JSON
 * @author: Ramon Andrade 2019
 * 
 */

public class ThreadsExecutorsRunnables {

		public static void main(String[] args) throws IOException {
			
			/* Threads and Executors */
	        System.out.println("Thread name: " + Thread.currentThread().getName());

	        System.out.println("Creating Executor Service...");
	        ExecutorService executorService = Executors.newSingleThreadExecutor();

	        System.out.println("Creating a Runnable...");
	        
	        Runnable runnable = () -> {
	            System.out.println("- Runnable execulted. Name: " + Thread.currentThread().getName());
	        };
	        
	        System.out.println("\n------");
	        System.out.println("------ Runnable task to be executed once ----- ");
	        System.out.println("------\n");
	        executorService.submit(runnable);
	        
	        
	        
	        
	        /* Executors 
	         * and 
	         * Runnable */
	        
	        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
	        
	        System.out.println("\n\n------");
	        System.out.println("Creating another Runnable...");
	        
	        Runnable task = () -> {
	        	
	        	String url = "https://kctbh9vrtdwd.statuspage.io/api/v2/status.json";
	        	String charset = "UTF-8";  // Or in Java 7 and later, use the constant: java.nio.charset.StandardCharsets.UTF_8.name()
	        
	        	// Http request
	        	HttpURLConnection c = null;
	            try {
	                URL u = new URL(url);
	                c = (HttpURLConnection) u.openConnection();
	                c.setRequestMethod("GET");
	                c.setRequestProperty("Content-length", "0");
	                c.setUseCaches(false);
	                c.setAllowUserInteraction(false);
	                int timeout = 3000;
					c.setConnectTimeout(timeout);
	                c.setReadTimeout(timeout);
	                c.connect();
	                int status = c.getResponseCode();

	                switch (status) {
	                case 200:
	                case 201:
	                	
	                	BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
	 	                String line, data = "";
	 	                while ((line = in.readLine()) != null) {
	 	                    data += line;
	 	                }
	 	                in.close();

	             		String s = data.toString();
	 	              
	                	JSONParser parser = new JSONParser();
		        	   
	        	      try {
	        	    	 
	        	    	  	// Parse to JSON
	        	            JSONObject jsonObject = (JSONObject) parser.parse(s);
	        	            
	        	            // Getting Details
	        	            JSONObject page = (JSONObject) jsonObject.get("page");
	        	            String time = (String) page.get("updated_at"); // Update time
	        	            String site = (String) page.get("name"); // Website name
 

	        	            JSONObject statuspage = (JSONObject) jsonObject.get("status"); 
	        	            String desc = (String) statuspage.get("description"); // Status Description

	        	            System.out.println("- " + site + " / Status: " + desc + " ("+ time +")");

	        	        } catch (ParseException e) {
	        	        	
	        	        	System.out.println("Error while parsing to JSON. "+ e.getMessage());
	     	               // Error
	        	        }
	        	      
	                  default:
	                	  
	                	  System.out.println("Something went wrong in your HTTP request.");
	     	              // Error
	                }
	                
	            } catch (MalformedURLException ex) {
	            	
	            	System.out.println("Malformed URL Error!");
	               // Error
	            	
	            } catch (IOException ex) {
	            	
	            	System.out.println("Something went wrong."+ ex.getMessage());
	               // Error
	            	
	            } finally {
	              // finally
	            }
	           
	          
	        };
	        
	  
	        System.out.println("\n\n------");
	        System.out.println("------ Scheduling Runnable task to be executed every 15 seconds (StatusPage API) ----- ");
	        System.out.println("------\n\n");
	        
	        // Execulte Runnable
	        scheduledExecutorService.scheduleAtFixedRate(task, 0, 15, TimeUnit.SECONDS);
	        
	    }

}
