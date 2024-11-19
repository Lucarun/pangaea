package edu.fudan.rosefinch;

import junit.framework.TestCase;


/**
 * User: luca
 * Date: 2024/11/17
 * Description:
 */
public class Junit4ExtendsTest extends TestCase {

    public void testParseArray(){
        System.out.println("test ParseArray in extends");
    }

    public void testParseMap(){
        System.out.println("test parseMap in extends");
    }


    public void testParseString(){
        String s = getString();
        String finalStr = transfer(s);
        System.out.println("finalStr : " + finalStr);
    }

    private String getString(){
        return "Luca";
    }

    private String transfer(String str){
        return str + "test";
    }

}
