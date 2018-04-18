package com.example.huangmin.takehomeassignment09_minh;


public class Person {


    public String id;
    public String name;
    public String numberOfTickets;
    public boolean haveKids;

    public Person() {
    }

    ;

    public Person(String id, String name, String numberOfTickets, boolean haveKids) {
        this.id=id;
        this.name = name;
        this.numberOfTickets = numberOfTickets;
        this.haveKids = haveKids;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(String numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public boolean isHaveKids() {
        return haveKids;
    }

    public void setHaveKids(boolean haveKids) {
        this.haveKids = haveKids;
    }

    @Override
    public String toString() {
        return "Person's name: " + name + '\'' +
                "Numbers of Tickets: " + numberOfTickets +
                "Have Kids under 6 accompanied?" + haveKids;
    }
}
