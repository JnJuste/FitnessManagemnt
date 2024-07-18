
package controller;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import service.implementation.*;
import java.rmi.RemoteException;

/**
 *
 * @author jeanj
 */
public class Server {
    public static void main(String[] args) {
        try {
            //Register (Set) the property
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            //Create Registry
            Registry registry = LocateRegistry.createRegistry(5000);
            registry.rebind("user", new UserImpl());
            registry.rebind("member", new MemberImpl());
            registry.rebind("trainer", new TrainerImpl());
            System.out.println("Server is running on Port 5000");
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
