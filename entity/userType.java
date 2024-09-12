package Jobportal.jobportal.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_type")
public class userType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userTypeID;

    private String userTypename;

    @OneToMany(targetEntity = user.class, mappedBy = "userType", cascade = CascadeType.ALL)
    private List<user> users;

    // Default constructor
    public userType() {
    }

    // Parameterized constructor
    public userType(int userTypeID, String userTypename, List<user> users) {
        this.userTypeID = userTypeID;
        this.userTypename = userTypename;
        this.users = users;
    }

    // Getters and setters
    public int getuserTypeID() {
        return userTypeID;
    }

    public void setuserTypeID(int userTypeID) {
        this.userTypeID = userTypeID;
    }

    public String getuserTypename() {
        return userTypename;
    }

    public void setuserTypename(String userTypename) {
        this.userTypename = userTypename;
    }

    public List<user> getusers() {
        return users;
    }

    public void setusers(List<user> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "userType{" +
                "userTypeID=" + userTypeID +
                ", userTypename='" + userTypename + '\'' +
                '}';
    }
}
