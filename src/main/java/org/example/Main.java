package org.example;

// Object 클래스 - toString 250314

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person a = new Person("케로로", 10);
        Person b = new Person("쿠루루", 10);

        System.out.println(a); // override 된 메서드가 자동 실행됨
        System.out.println(b);

        System.out.println("=========================");
        System.out.println(a.toString());
        System.out.println(b.toString());

    }
}

class Person extends Object { // Object는 최상위 클래스라서 extends가 가능
    String name;
    int age ;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override // 오버라이딩임을 알려줌. 주석과 같다.
    public String toString() {
        return "이름 : " +  name + ", 나이 : " + age;
    }
}

