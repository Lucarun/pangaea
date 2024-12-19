package edu.fudan.rosefinch.polymorphism;

/**
 * User: luca
 * Date: 2024/10/15
 * Description:
 */
public abstract class Encryptor {
    Sign sign;
    Sign encrypt(String s){
        this.sign.content = s;
        assign();
        return this.sign;
    }
    abstract void assign();
    public static Sign encryptBy(Encryptor encryptor, String s){
        if (encryptor == null){
            encryptor =  new DefaultEncryptor();
        }
        return encryptor.encrypt(s);
    }
    public class Sign{
        public String header;
        public String content;
    }
}


