package edu.fudan.rosefinch.poly;

/**
 * User: luca
 * Date: 2024/10/12
 * Description:
 */
public class AppEntry {

    public static void entry(String country, String city) {
        Address address = new Address(country, city);
        House house = new House(address);
        Person person = new Person(house);
        IEncryptor encryptor = new CityEncryptor();
        Person p = encryptor.encrypt(person);
        Sink.crime(p.house.address.country);
        Sink.crime(p.house.address.city);
    }

}
