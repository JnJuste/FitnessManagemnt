package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author jeanj
 */
@Entity
public class Member implements Serializable{
    @Id
    private String memberID;
    private String memberNames;
    private String memberAge;
    private String memberAddr;
    private String memberPhone;
    private String memberGender;
    private String memberSubscription;
    private String memberRegDate;
    private String memberTrainer;

    public Member() {
    }

    public Member(String memberID) {
        this.memberID = memberID;
    }

    public Member(String memberID, String memberNames, String memberAge, String memberAddr, String memberPhone, String memberGender, String memberSubscription, String memberRegDate, String memberTrainer) {
        this.memberID = memberID;
        this.memberNames = memberNames;
        this.memberAge = memberAge;
        this.memberAddr = memberAddr;
        this.memberPhone = memberPhone;
        this.memberGender = memberGender;
        this.memberSubscription = memberSubscription;
        this.memberRegDate = memberRegDate;
        this.memberTrainer = memberTrainer;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getMemberNames() {
        return memberNames;
    }

    public void setMemberNames(String memberNames) {
        this.memberNames = memberNames;
    }

    public String getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(String memberAge) {
        this.memberAge = memberAge;
    }

    public String getMemberAddr() {
        return memberAddr;
    }

    public void setMemberAddr(String memberAddr) {
        this.memberAddr = memberAddr;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getMemberGender() {
        return memberGender;
    }

    public void setMemberGender(String memberGender) {
        this.memberGender = memberGender;
    }

    public String getMemberSubscription() {
        return memberSubscription;
    }

    public void setMemberSubscription(String memberSubscription) {
        this.memberSubscription = memberSubscription;
    }

    public String getMemberRegDate() {
        return memberRegDate;
    }

    public void setMemberRegDate(String memberRegDate) {
        this.memberRegDate = memberRegDate;
    }

    public String getMemberTrainer() {
        return memberTrainer;
    }

    public void setMemberTrainer(String memberTrainer) {
        this.memberTrainer = memberTrainer;
    }


    
}
