
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Trainer;
/**
 *
 * @author jeanj
 */
public interface TrainerInterfaceService extends Remote{
    //METHOD SIGNATURE
    public String registerTrainer(Trainer trObj) throws RemoteException;
    public String updateTrainer(Trainer trObj) throws RemoteException;
    public String deleteTrainer(Trainer trObj) throws RemoteException;
    public List<Trainer> allTrainers() throws RemoteException;
    public List<Trainer> searchTrainers(Trainer trObj) throws RemoteException;
}
