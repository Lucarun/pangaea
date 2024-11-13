package edu.fudan.rosefinch.poly;

/**
 * User: luca
 * Date: 2024/10/12
 * Description:
 */
public class NumberEncryptor implements IEncryptor{
    @Override
    public Person encrypt(Person p) {
        p.house.number = "safe";
        return p;
    }
}
