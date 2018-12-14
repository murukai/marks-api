package com.mufakose.students.marksapi.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mumu on 2/12/2018.
 */
@Entity
public class Address {

    /*
     *This is the address object it will store physical address and also mobile details as well as social media links
     */
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String streetOne;
    private String streetTwo;
    private String city;
    private String district;
    private String province;
    private String country;

    /*
     * This is the section for mobile details of the student
     */

    private String cellphone;
    private String phone;


    @ManyToOne
    private Student student;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Link> links;

    public Address() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreetOne() {
        return streetOne;
    }

    public void setStreetOne(String streetOne) {
        this.streetOne = streetOne;
    }

    public String getStreetTwo() {
        return streetTwo;
    }

    public void setStreetTwo(String streetTwo) {
        this.streetTwo = streetTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", streetOne='" + streetOne + '\'' +
                ", streetTwo='" + streetTwo + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
