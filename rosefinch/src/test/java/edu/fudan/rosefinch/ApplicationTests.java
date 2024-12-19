package edu.fudan.rosefinch;

import edu.fudan.rosefinch.poly.IEncryptor;
import edu.fudan.rosefinch.poly.NameEncryptor;
import edu.fudan.rosefinch.poly.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    IEncryptor iEncryptor;

    @Test
    void contextLoads() {
    }

    @Test
    void testBean(){
        System.out.println("Test Bean");
    }

    @Test
    void test(){
        Person p = new Person(null, "Luca");
        Person encryptedPerson = getEncryptedInfo(iEncryptor, p);
        System.out.println(encryptedPerson);
    }

    public Person getEncryptedInfo(IEncryptor encryptor, Person p){
        return encryptor.encrypt(p);
    }
}
