
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.User;

/**
 *
 * @author jeanj
 */
public interface UserInterfaceService extends Remote{
    //METHOD SIGNATURE
    String registerUser(User usObj) throws RemoteException;
    String updateUser(User usObj) throws RemoteException;
    String deleteUser(User usObj) throws RemoteException;
    List<User> allUsers() throws RemoteException;
    List<User> LoginUser(User usObj) throws RemoteException;
    public List<User> searchUsers(User usObj) throws RemoteException;
}
