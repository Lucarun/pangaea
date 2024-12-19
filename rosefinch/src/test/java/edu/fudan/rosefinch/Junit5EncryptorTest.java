package edu.fudan.rosefinch;

import edu.fudan.rosefinch.poly.IEncryptor;
import edu.fudan.rosefinch.poly.NameEncryptor;
import edu.fudan.rosefinch.poly.Person;
import edu.fudan.rosefinch.polymorphism.Encryptor;
import edu.fudan.rosefinch.polymorphism.EncryptorFactory;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * User: luca
 * Date: 2024/11/13
 * Description:
 */
public class Junit5EncryptorTest {

    @Test
    void printTest(){
        System.out.println("print Test");
    }

    @Test
    void encryptorTest(){
        String s = "unsafe";
        Encryptor encryptor = getEncryptor(getType());
        Encryptor.Sign sign = Encryptor.encryptBy(encryptor, s);
        sink(sign.content);
    }


    @Test
    void encryptorImplTest(){
        Person p = new Person(null, "Luca");
        NameEncryptor cityEncryptor = new NameEncryptor();
        Person encryptedPerson = getEncryptedInfo(cityEncryptor, p);
        System.out.println(encryptedPerson);
    }


    // suppose no idea about the concrete return type
    public Encryptor getEncryptor(String type){
        System.out.println("type is : " + type);
        return EncryptorFactory.getEncryptor(type);
    }

    public String getType(){
        // 创建一个 Properties 对象
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream("config.properties")) {
            // 加载 properties 文件
            properties.load(input);
            // 获取 key 为 "type" 的值
            String type = properties.getProperty("type");
            // 输出结果
            System.out.println("The value of 'type' is: " + type);
            return type;
        } catch (IOException e) {
            return "name";
        }
    }

    public Person getEncryptedInfo(IEncryptor encryptor, Person p){
        return encryptor.encrypt(p);
    }


    void sink(Object o){

    }
}
