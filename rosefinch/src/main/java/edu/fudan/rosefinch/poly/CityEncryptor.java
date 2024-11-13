package edu.fudan.rosefinch.poly;

/**
 * User: luca
 * Date: 2024/10/12
 * Description:
 */
public class CityEncryptor implements IEncryptor{
    @Override
    public Person encrypt(Person p) {
        p.house.address.city = "safe-city";
        return p;
    }
}
