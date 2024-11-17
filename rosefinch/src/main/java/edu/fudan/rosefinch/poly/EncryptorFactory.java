package edu.fudan.rosefinch.poly;

public class EncryptorFactory {
    // 静态工厂方法，根据条件选择实现类
    public static IEncryptor getEncryptor(String type) {
        if (type.toLowerCase().equals("country")) {
            return new CountryEncryptor();
        } else if (type.toLowerCase().equals("city")) {
            return new CityEncryptor();
        }else if (type.toLowerCase().equals("name")) {
            return new NameEncryptor();
        }
        throw new IllegalArgumentException("Unknown Encryptor type: " + type);
    }
}