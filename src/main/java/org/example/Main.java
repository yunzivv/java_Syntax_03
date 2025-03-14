package org.example;

// equals 250314

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person(13);
        Person p2 = new Person(13);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2)); // 어떤 내용이 같을 때인지 명시가 되어있지 않음

        String s1 = "로로";
        String s2 = "로로";

        System.out.println(s1 == s2);

        String r1 = new String("로로");
        String r2 = new String("로로");

        System.out.println(r1 == r2);
        System.out.println(r1.equals(r2));
    }
}

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }
}

