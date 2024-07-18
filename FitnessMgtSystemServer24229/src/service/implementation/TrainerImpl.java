
package service.implementation;

import DAO.TrainerDAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;
import model.Trainer;
import service.TrainerInterfaceService;
/**
 *
 * @author jeanj
 */
public class TrainerImpl extends UnicastRemoteObject implements TrainerInterfaceService{

    public TrainerImpl() throws Exception{
        super();
    }
    
    private TrainerDAO tr = new TrainerDAO();
    
    @Override
    public String registerTrainer(Trainer trObj) throws RemoteException {
        try{
            tr.registerTrainer(trObj);
            return "TRAINER SAVED";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "TRAINER NOT SAVED";
    }

    @Override
    public String updateTrainer(Trainer trObj) throws RemoteException {
        try{
            tr.updateTrainer(trObj);
            return "TRAINER UPDATED";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "TRAINER NOT UPDATED";
    }

    @Override
    public String deleteTrainer(Trainer trObj) throws RemoteException {
        try{
            tr.deleteTrainer(trObj);
            return "TRAINER DELETED";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "TRAINER NOT DELETED";
    }

    @Override
    public List<Trainer> allTrainers() throws RemoteException {
        try{
            return tr.allTrainers();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Trainer> searchTrainers(Trainer trObj) throws RemoteException {
        try{
            return tr.searchTrainers(trObj);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
}
