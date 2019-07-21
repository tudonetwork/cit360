package cit360.mvchibernate.controller;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cit360.mvchibernate.hibernate.util.HibernateUtil;
import cit360.mvchibernate.model.Lead;


/* CIT 360
 * @author: RAMON ANDRADE @2019
 * 
 * */

public class LeadController {
	
    /* List all leads
     * return list
     * */
    
    public List<Lead> getListOfLeads(){
        List<Lead> list = new ArrayList<Lead>();
        Session session = HibernateUtil.openSession();
        Transaction tx = null;        
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from Lead").list();                        
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        
        return list;
        

    }
    
    
    public boolean register(Lead lead){
   	 Session session = HibernateUtil.openSession();
   	 
   	 if(isLeadExists(lead)) return false;	
   	
   	 Transaction tx = null;	
   	 try {
   		 tx = session.getTransaction();
   		 tx.begin();
   		 session.saveOrUpdate(lead);		
   		 tx.commit();
   	 } catch (Exception e) {
   		 if (tx != null) {
   			 tx.rollback();
   		 }
   		 e.printStackTrace();
   	 } finally {
   		 session.close();
   	 }	
   	 return true;
   }
    

   public boolean isLeadExists(Lead lead){
   	
   	 Session session = HibernateUtil.openSession();
   	 boolean result = false;
   	 Transaction tx = null;
   	 try{
   		 tx = session.getTransaction();
   		 tx.begin();
   		 Query query = session.createQuery("from Lead where email='"+lead.getEmail()+"'");
   		 Lead u = (Lead)query.uniqueResult();
   		 tx.commit();
   		 if(u!=null) result = true;
   	 }catch(Exception ex){
   		 if(tx!=null){
   			 tx.rollback();
   		 }
   	 }finally{
   		 session.close();
   	 }
   	 return result;
   }
}
