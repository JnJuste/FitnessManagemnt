
package DAO;

import java.util.*;
import model.Trainer;
import org.hibernate.*;
/**
 *
 * @author jeanj
 */
public class TrainerDAO {
    public TrainerDAO(){}
    //CRUD Operation
    
    //CREATE OPERATION
    public void registerTrainer(Trainer trObj) {
        try{//CREATE SESSION
        Session ss = HibernateUtil.getSessionFactory().openSession();
        //CREATE TRANSACTION
        Transaction tr = ss.beginTransaction();
        //SAVE MEMBER
        ss.save(trObj);
        //COMMIT
        tr.commit();
        //CLOSE SESSION
        ss.close();
            System.out.println("TRAINER REGISTERED SUCCESSFULLY");
        }catch (HibernateException ex) {
            System.out.println(ex);
        }
    }
    
    //UPDATE OPERATION
    public void updateTrainer(Trainer trObj) {
        try{
        //CREATE SESSION
        Session ss = HibernateUtil.getSessionFactory().openSession();
        //CREATE TRANSACTION
        Transaction tr = ss.beginTransaction();
        //SAVE MEMBER
        ss.update(trObj);
        //COMMIT
        tr.commit();
        //CLOSE SESSION
        ss.close();
        System.out.println("TRAINER UPDATED SUCCESSFULLY");
        }catch (HibernateException ex) {
            System.out.println(ex);
        }
    }
    
    //DELETE OPERATION
    public void deleteTrainer(Trainer trObj) {
        try{
        //CREATE SESSION
        Session ss = HibernateUtil.getSessionFactory().openSession();
        //CREATE TRANSACTION
        Transaction tr = ss.beginTransaction();
        //SAVE MEMBER
        ss.delete(trObj);
        //COMMIT
        tr.commit();
        //CLOSE SESSION
        ss.close();
        System.out.println("TRAINER DELETED SUCCESSFULLY");
        }catch (HibernateException ex) {
            System.out.println(ex);
        }
    }
    
    //READ/RETRIEVE OPERATION
    public List<Trainer> allTrainers() {
        try{//CREATE SESSION
        Session ss = HibernateUtil.getSessionFactory().openSession();
        List<Trainer> trainersList= ss.createQuery("SELECT tr FROM Trainer tr").list();
        ss.close();
        return trainersList;
        }catch (HibernateException ex) {
            System.out.println(ex);
        }
        return null;
    }
   
    //SEARCH BY ID
    //SEARCH TRAINER BY ID
    public List<Trainer> searchTrainers(Trainer trObj) {
        try {
            String queryString = "SELECT tr FROM Trainer tr WHERE tr.trainerID LIKE :trainerID ORDER BY trainerID ASC";
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Query query = ss.createQuery(queryString);
            query.setParameter("trainerID", "%" + trObj.getTrainerID() + "%");
            List<Trainer> trainers = (List<Trainer>) query.list();
            return trainers;
        } catch (HibernateException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
}
