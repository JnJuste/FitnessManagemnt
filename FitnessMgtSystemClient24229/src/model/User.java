package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author jeanj
 */
public class User implements Serializable{
    //Private Variables
    private String userID;
    private String userNames;
    private String userEmail;
    private String userPassword;

    public User() {
    }

    public User(String userID) {
        this.userID = userID;
    }

    public User(String userID, String userNames, String userEmail, String userPassword) {
        this.userID = userID;
        this.userNames = userNames;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserNames() {
        return userNames;
    }

    public void setUserNames(String userNames) {
        this.userNames = userNames;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    
    
    
}
