
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Member;

/**
 *
 * @author jeanj
 */
public interface MemberInterfaceService extends Remote{
    //METHOD SIGNATURE
    public String registerMember(Member memObj) throws RemoteException;
    public String updateMember(Member memObj) throws RemoteException;
    public String deleteMember(Member memObj) throws RemoteException;
    public List<Member> allMembers() throws RemoteException;
    public List<Member> searchMembers(Member memObj) throws RemoteException;
}
