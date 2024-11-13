package edu.fudan.rosefinch.poly;

/**
 * User: luca
 * Date: 2024/10/12
 * Description:
 */
public class NameEncryptor implements IEncryptor{
    @Override
    public Person encrypt(Person p) {
        p.name = "safe";
        return p;
    }
}
