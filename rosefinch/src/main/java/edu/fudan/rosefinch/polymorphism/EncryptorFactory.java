package edu.fudan.rosefinch.polymorphism;

import edu.fudan.rosefinch.poly.CityEncryptor;
import edu.fudan.rosefinch.poly.CountryEncryptor;
import edu.fudan.rosefinch.poly.IEncryptor;
import edu.fudan.rosefinch.poly.NameEncryptor;

public class EncryptorFactory {
    public static Encryptor getEncryptor(String type) {
        if (type.toLowerCase().equals("base64")) {
            return new Base64Encryptor();
        } else if (type.toLowerCase().equals("md5")) {
            return new MD5Encryptor();
        }else if (type.toLowerCase().equals("default")) {
            return new DefaultEncryptor();
        }
        throw new IllegalArgumentException("Unknown Encryptor type: " + type);
    }
}