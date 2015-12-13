package com.wmusial.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

    private int id;
    private String name;
    private int taxId;

    private Address address;

    private List<Address> pastAddresses;

    private Set<String> jobs;

    private Map<String, String> friends;
    private Map<String, Address> addresses;

    public Person(int id, String name, Set<String> jobs) {
        this.id = id;
        this.name = name;
        this.jobs = jobs;
    }

    public void speak() {
        System.out.println("Hello. I'm person");
    }

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void onCreate() {
        System.out.println("Person created: " + this);
    }

    public void destroy() {
        System.out.println("Person destroyed: " + this);
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPastAddresses(List<Address> pastAddresses) {
        this.pastAddresses = pastAddresses;
    }

    public void setFriends(Map<String, String> friends) {
        this.friends = friends;
    }

    public void setAddresses(Map<String, Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taxId=" + taxId +
                ", address=" + address +
                ", pastAddresses=" + pastAddresses +
                ", jobs=" + jobs +
                '}';
    }
}
