package com.mufakose.students.marksapi.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by mumu on 2/12/2018.
 */
@Entity
public class Student {

    /*
     *Student attributes
     * this is a student object that will be used for saving student information
     */
    @Id
    private String studentID;

    private String firstName;
    private String lastName;
    private String gender;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    private String studentPassword;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Address> addresses;


    public Student() {
        this.studentID = "STD" + UUID.randomUUID().toString().substring(28).toUpperCase();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", studentPassword='" + studentPassword + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
