package com.kriehl.contract.dto;

public class Contract {

    private String name;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    private String test;

    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    /*
    @Override
    public String toString() {
        return "Contract{" +
                "Name = '" + name + '\'' +
                ", ID = " + id +
                '}';
    }

     */

    public void setId(int id) {
        this.id = id;
    }
}
