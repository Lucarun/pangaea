package edu.fudan.rosefinch.polymorphism;

class DefaultEncryptor extends Encryptor{void assign() {this.sign.header = "unsafe";}}
class Base64Encryptor extends Encryptor{void assign() {this.sign.header = "safe";}}
class MD5Encryptor extends Encryptor{void assign() {this.sign.content = "safe";}}

public class Main{
    public static void main(String[] args) {
        String s = "unsafe";
        Encryptor encryptor = new Base64Encryptor();
        Encryptor.Sign sign = Encryptor.encryptBy(encryptor, s);
    }
}