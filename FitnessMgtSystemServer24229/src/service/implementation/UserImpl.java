
package service.implementation;

import DAO.UserDAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;
import model.User;
import service.UserInterfaceService;
/**
 *
 * @author jeanj
 */
public class UserImpl extends UnicastRemoteObject implements UserInterfaceService{

    public UserImpl() throws Exception{
        super();
    }
    private UserDAO us = new UserDAO();
    @Override
    public String registerUser(User usObj) throws RemoteException {
        try{
            us.registerUser(usObj);
            return "USER SAVED";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "USER NOT SAVED";
    }

    @Override
    public String updateUser(User usObj) throws RemoteException {
        try{
            us.updateUser(usObj);
            return "USER UPDATED";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "USER NOT UPDATED";
    }

    @Override
    public String deleteUser(User usObj) throws RemoteException {
        try{
            us.deleteUser(usObj);
            return "USER DELETED";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "USER NOT DELETED";
    }

    @Override
    public List<User> allUsers() throws RemoteException {
        try{
            return us.allUsers();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> LoginUser(User usObj) throws RemoteException {
        try{
            return us.LoginUser(usObj);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    @Override
    public List<User> searchUsers(User usObj) throws RemoteException {
        try{
            return us.searchUsers(usObj);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
