package cit360.mvchibernate.controller;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cit360.mvchibernate.hibernate.util.HibernateUtil;
import cit360.mvchibernate.model.User;

/* CIT 360
 * @author: RAMON ANDRADE @2019
 * 
 * */

public class UserController {

    public boolean authenticateUser(String userId, String password) {
        User user = getUserByUserId(userId);          
        if(user!=null && user.getUserId().equals(userId) && user.getPassword().equals(password)){
            return true;
        }else{ 
            return false;
        }
    }

    public User getUserByUserId(String userId) {
        Session session = HibernateUtil.openSession();
        Transaction tx = null;
        User user = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from User where userId='"+userId+"'");
            user = (User)query.uniqueResult();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return user;
    }
    
}
