package com.mufakose.students.marksapi.entity;

import javax.persistence.*;

/**
 * Created by mumu on 2/12/2018.
 */
@Entity
public class Link {

    /*
     * Student link attributes
     */
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String linkAddressUrl;

    @ManyToOne
    private Address address;

    public Link() {
    }

    public Link(String title, String linkAddressUrl) {
        this.title = title;
        this.linkAddressUrl = linkAddressUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLinkAddressUrl() {
        return linkAddressUrl;
    }

    public void setLinkAddressUrl(String linkAddressUrl) {
        this.linkAddressUrl = linkAddressUrl;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
