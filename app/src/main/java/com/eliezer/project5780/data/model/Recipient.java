package com.eliezer.project5780.data.model;

public class Recipient {
    private String Name;
    private String Address;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Recipient() {
        setName("Israel Israeli");
        setAddress("123 Herzl Bld, Jerusalem, ISRAEL");
    }

    public Recipient(String name, String address) {
        Name = name;
        Address = address;
    }

    @Override
    public String toString() {
        return "Recipient{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
