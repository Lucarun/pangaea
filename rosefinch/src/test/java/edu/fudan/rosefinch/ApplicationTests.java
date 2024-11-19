package edu.fudan.rosefinch;

import edu.fudan.rosefinch.poly.IEncryptor;
import edu.fudan.rosefinch.poly.NameEncryptor;
import edu.fudan.rosefinch.poly.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

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
        NameEncryptor cityEncryptor = new NameEncryptor();
        Person encryptedPerson = getEncryptedInfo(cityEncryptor, p);
        System.out.println(encryptedPerson);
    }

    public Person getEncryptedInfo(IEncryptor encryptor, Person p){
        return encryptor.encrypt(p);
    }
}
