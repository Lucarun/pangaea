package edu.fudan.rosefinch.poly;

/**
 * User: luca
 * Date: 2024/10/12
 * Description:
 */
public class Person {

    public House house;

    public String name;

    public Person(House house, String name) {
        this.house = house;
        this.name = name;
    }

    public Person(House house) {
        this.house = house;
    }
}
