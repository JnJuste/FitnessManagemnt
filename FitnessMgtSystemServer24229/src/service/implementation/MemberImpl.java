
package service.implementation;

import DAO.MemberDAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;
import model.Member;
import service.MemberInterfaceService;
/**
 *
 * @author jeanj
 */
public class MemberImpl extends UnicastRemoteObject implements MemberInterfaceService{

    public MemberImpl() throws Exception{
        super();
    }
    private MemberDAO mem = new MemberDAO();
    @Override
    public String registerMember(Member memObj) throws RemoteException {
        try{
            mem.registerMember(memObj);
            return "MEMBER SAVED";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "MEMBER NOT SAVED";
    }

    @Override
    public String updateMember(Member memObj) throws RemoteException {
        try{
            mem.updateMember(memObj);
            return "MEMBER UPDATED";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "MEMBER NOT UPDATED";
    }

    @Override
    public String deleteMember(Member memObj) throws RemoteException {
        try{
            mem.deleteMember(memObj);
            return "MEMBER DELETED";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "MEMBER NOT DELETED";
    }

    @Override
    public List<Member> allMembers() throws RemoteException {
        try{
            return mem.allMembers();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Member> searchMembers(Member memObj) throws RemoteException {
        try{
            return mem.searchMembers(memObj);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
}
