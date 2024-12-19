package edu.fudan.rosefinch.sensitive;

import edu.fudan.rosefinch.operation.Demo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

/**
 * User: luca
 * Date: 2024/12/8
 * Description:
 */
public class TestExample {

    String key;

    B b = new B();

//    public static void testFieldSensitive1(String str, int num) {
//        A a = new A();
//        constructObject1(a, str, num);
//        Demo.sink1(a);
//        Demo.sink2(a.header);
//        Demo.sink3(a.b);
//    }


//    private static void constructObject1(A a, String str, int num){
//        a.setHeader(str);
//    }



    public static void testFieldSensitive2(String str, int num) {
        A a = new A();
        a = constructObject2(a, str, num);
        Demo.sink1(a);
        Demo.sink2(a.b);
        Demo.sink3(a.header);
        Demo.sink4(a.b.content);
        Demo.sink5(a.b.size);
    }

    private static A constructObject2(A a, String str, int num){
//        a.header = str;
        return a;
    }


    public void testFieldSensitive3(String str, int num) {
        TestExample testExample = new TestExample();
        testExample.constructObject3(str);
        Demo.sink1(testExample);
        Demo.sink2(testExample.key);
        Demo.sink3(testExample.b);
        Demo.sink4(testExample.b.content);
        Demo.sink5(testExample.b.size);
    }


    private void constructObject3(String str){
//        this.b.content = str;
    }



    public void testPathSensitive1(String str) {
        A a = new A();
        TestExample testExample = new TestExample();
        testExample.propagate1(a, str);
        Demo.sink1(testExample);
        Demo.sink2(testExample.key);
        Demo.sink3(testExample.b);
        Demo.sink4(testExample.b.content);
        Demo.sink5(testExample.b.size);
    }

    private void propagate1(A a, String str){
        if (a == null){
//            this.b.content = str;
        }
    }


//
//    public static void testPathSensitive1(String content, int size) {
//        A a = new A();
//        TestExample testExample = new TestExample();
//        B b = testExample.propagate1(a, size);
//        Demo.sink1(b);
//        Demo.sink2(b.size);
//        Demo.sink3(b.content);
//    }

//    public static void testPathSensitive2(String header) {
//        A a = new A();
//        TestExample testExample = new TestExample();
//        testExample.propagate2(a, header);
//        Demo.sink2(a.header);
//    }

//    private B propagate1(A a, int size){
//        B b = new B();
//        b.setSize(size);
//        return b;
//    }
//
//    private A propagate2(A a, String header){
//        if (a instanceof C){
//            a.setHeader(header);
//            return a;
//        }else{
//            return new A();
//        }
//    }
//
//
//    public void init(A a) {
//        Random random = new Random();
//        if (random.nextInt() == 0){
//            a = new A();
//        }else{
//            a= null;
//        }
//    }





}
