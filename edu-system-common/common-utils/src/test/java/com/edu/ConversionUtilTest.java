package com.edu;

import lombok.Data;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: ConversionUtilTest <br>
 * @date: 2020/1/9 16:12 <br>
 * @author: 86173 <br>
 * @version: 1.0 <br>
 */
public class ConversionUtilTest {
    @Data
    class Person{
        private int age;
        private String name;
    }
    @Test
    public void modelToMap() {
        Person person = new Person();
        person.setAge(27);
        person.setName("haoRen");
        Map<String, Object> map = ConversionUtil.modelToMap(person);
        System.out.println("map = " + map);
        Object age = map.get("age");
        System.out.println("age = " + age);
    }
}
