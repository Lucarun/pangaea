package edu.fudan.rosefinch.poly;

public class House{
    public Address address;

    public String number;


    public House(Address address, String number) {
        this.address = address;
        this.number = number;
    }

    public House(Address address) {
        this.address = address;
    }
}