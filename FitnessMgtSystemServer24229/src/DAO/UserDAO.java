package DAO;


import java.util.*;
import model.User;
import org.hibernate.*;

/**
 *
 * @author jeanj
 */
public class UserDAO {
    //CRUD Operation
    
    //CREATE OPERATION
    public void registerUser(User usObj) {
        try{//CREATE SESSION
        Session ss = HibernateUtil.getSessionFactory().openSession();
        //CREATE TRANSACTION
        Transaction tr = ss.beginTransaction();
        //SAVE MEMBER
        ss.save(usObj);
        //COMMIT
        tr.commit();
        //CLOSE SESSION
        ss.close();
            System.out.println("USER REGISTERED SUCCESSFULLY");
        }catch (HibernateException ex) {
            System.out.println(ex);
        }
    }
    
    //UPDATE OPERATION
    public void updateUser(User usObj) {
        try{
        //CREATE SESSION
        Session ss = HibernateUtil.getSessionFactory().openSession();
        String st = "UPDATE User SET userNames = :user_names, userEmail = :email, userPassword = :password WHERE userID = :user_id";
        Query query = ss.createQuery(st);
        query.setParameter("user_names", usObj.getUserNames());
        query.setParameter("email", usObj.getUserEmail());
        query.setParameter("password", usObj.getUserPassword());
        query.setParameter("user_id", usObj.getUserID());
        query.executeUpdate();
        //CREATE TRANSACTION
        //SAVE MEMBER
        //COMMIT
        //CLOSE SESSION
        ss.close();
        System.out.println("USER UPDATED SUCCESSFULLY");
        }catch (HibernateException ex) {
            System.out.println(ex);
        }
    }
    
    //DELETE OPERATION
    public void deleteUser(User usObj) {
        try{
        //CREATE SESSION
        Session ss = HibernateUtil.getSessionFactory().openSession();
        //CREATE TRANSACTION
        Transaction tr = ss.beginTransaction();
        //SAVE MEMBER
        ss.delete(usObj);
        //COMMIT
        tr.commit();
        //CLOSE SESSION
        ss.close();
        System.out.println("USER DELETED SUCCESSFULLY");
        }catch (HibernateException ex) {
            System.out.println(ex);
        }
    }
    
    //READ/RETRIEVE OPERATION
    public List<User> allUsers() {
        try{//CREATE SESSION
        Session ss = HibernateUtil.getSessionFactory().openSession();
        List<User> usersList= ss.createQuery("SELECT us FROM User us").list();
        ss.close();
        return usersList;
        }catch (HibernateException ex) {
            System.out.println(ex);
        }
        return null;
    }
   
    //USER LOGIN
    public List<User> LoginUser(User usObj) {
        try {
            //CREATE SESSION 
            Session ss = HibernateUtil.getSessionFactory().openSession();
            String queryString = "SELECT userEmail, userPassword FROM User WHERE userEmail = :user_email AND userPassword = :user_password";

            Query query = ss.createQuery(queryString);
            query.setParameter("user_email", usObj.getUserEmail());
            query.setParameter("user_password", usObj.getUserPassword());
            List<User> users = (List<User>) query.list();
            
            ss.close();
            return users;
        } catch (HibernateException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
    //SEARCH MEMBER BY ID
    public List<User> searchUsers(User usObj) {
        try {
            String queryString = "SELECT us FROM User us WHERE us.userID LIKE :userID ORDER BY userID ASC";
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Query query = ss.createQuery(queryString);
            query.setParameter("userID", "%" + usObj.getUserID() + "%");
            List<User> users = (List<User>) query.list();
            return users;
        } catch (HibernateException ex) {
            System.out.println(ex);
        }
        return null;
    }
}
