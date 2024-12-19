package edu.fudan.rosefinch.polymorphism;

public class Main{
    public static void main(String[] args) {
        String s = "unsafe";
        Encryptor encryptor = new Base64Encryptor();
        Encryptor.Sign sign = Encryptor.encryptBy(encryptor, s);
    }
}