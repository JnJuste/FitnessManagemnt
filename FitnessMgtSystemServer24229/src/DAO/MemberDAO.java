
package DAO;

import java.util.*;
import model.Member;
import org.hibernate.*;

/**
 *
 * @author jeanj
 */
public class MemberDAO {
    public MemberDAO() {}
    //CRUD Operation
    
    //CREATE OPERATION
    public void registerMember(Member memObj) {
        try{
        //CREATE SESSION
        Session ss = HibernateUtil.getSessionFactory().openSession();
        //CREATE TRANSACTION
        Transaction tr = ss.beginTransaction();
        //SAVE MEMBER
        ss.save(memObj);
        //COMMIT
        tr.commit();
        //CLOSE SESSION
        ss.close();
        System.out.println("MEMBER REGISTERED SUCCESSFULLY");
        }catch (HibernateException ex) {
            System.out.println(ex);
        }
    }
    
    //UPDATE OPERATION
    public void updateMember(Member memObj) {
        try{
        //CREATE SESSION
        Session ss = HibernateUtil.getSessionFactory().openSession();
        //CREATE TRANSACTION
        Transaction tr = ss.beginTransaction();
        //SAVE MEMBER
        ss.update(memObj);
        //COMMIT
        tr.commit();
        //CLOSE SESSION
        ss.close();
        System.out.println("MEMBER UPDATED SUCCESSFULLY");
        }catch (HibernateException ex) {
            System.out.println(ex);
        }
    }
    
    //DELETE OPERATION
    public void deleteMember(Member memObj) {
        try{//CREATE SESSION
        Session ss = HibernateUtil.getSessionFactory().openSession();
        //CREATE TRANSACTION
        Transaction tr = ss.beginTransaction();
        //SAVE MEMBER
        ss.delete(memObj);
        //COMMIT
        tr.commit();
        //CLOSE SESSION
        ss.close();
        System.out.println("MEMBER DELETED SUCCESSFULLY");
        }catch (HibernateException ex) {
              System.out.println(ex);
        }
    }
    
    //READ/RETRIEVE OPERATION
    public List<Member> allMembers() {
        try{//CREATE SESSION
        Session ss = HibernateUtil.getSessionFactory().openSession();
        List<Member> membersList= ss.createQuery("SELECT mem FROM Member mem").list();
        ss.close();
        return membersList;
        }catch (HibernateException ex) {
            System.out.println(ex);
        }
        return null;
    }
   
    //SEARCH MEMBER BY ID
    public List<Member> searchMembers(Member memObj) {
        try {
            String queryString = "SELECT mem FROM Member mem WHERE mem.memberID LIKE :memberID ORDER BY memberID ASC";
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Query query = ss.createQuery(queryString);
            query.setParameter("memberID", "%" + memObj.getMemberID() + "%");
            List<Member> members = (List<Member>) query.list();
            return members;
        } catch (HibernateException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
}
