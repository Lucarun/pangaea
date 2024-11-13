package edu.fudan.rosefinch.poly;

/**
 * User: luca
 * Date: 2024/10/12
 * Description:
 */
public class AppEncryptor implements IEncryptor{
    @Override
    public Person encrypt(Person p) {
        doAnyThing(p);
        return p;
    }

    public void doAnyThing(Person p){

    }
}
