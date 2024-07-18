package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author jeanj
 */
@Entity
public class Trainer implements Serializable{
    @Id
    private String trainerID;
    private String trainerNames;
    private String trainerAge;
    private String trainerAddr;
    private String trainerPhone;

    public Trainer() {
    }

    public Trainer(String trainerID) {
        this.trainerID = trainerID;
    }

    public Trainer(String trainerID, String trainerNames, String trainerAge, String trainerAddr, String trainerPhone) {
        this.trainerID = trainerID;
        this.trainerNames = trainerNames;
        this.trainerAge = trainerAge;
        this.trainerAddr = trainerAddr;
        this.trainerPhone = trainerPhone;
    }

    public String getTrainerID() {
        return trainerID;
    }

    public void setTrainerID(String trainerID) {
        this.trainerID = trainerID;
    }

    public String getTrainerNames() {
        return trainerNames;
    }

    public void setTrainerNames(String trainerNames) {
        this.trainerNames = trainerNames;
    }

    public String getTrainerAge() {
        return trainerAge;
    }

    public void setTrainerAge(String trainerAge) {
        this.trainerAge = trainerAge;
    }

    public String getTrainerAddr() {
        return trainerAddr;
    }

    public void setTrainerAddr(String trainerAddr) {
        this.trainerAddr = trainerAddr;
    }

    public String getTrainerPhone() {
        return trainerPhone;
    }

    public void setTrainerPhone(String trainerPhone) {
        this.trainerPhone = trainerPhone;
    }

    
}
