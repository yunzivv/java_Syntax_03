package org.example;

// Main 클래스와 다른 클래스, main 메서드와 다른 메서드 250311

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // ctrl + shift + o -> 자동 import

        // Main 클래스와 분리되어 있는 hi 함수를 사용하기 위해서는 hi 함수가 위치해 있는 클래스와 연결해주어야함
        MyClass a = new MyClass();
        a.hi();

        new MyClass().hi(); // 재사용할 변수를 만들지 않고 일회용으로 사용 가능

        hello();
    }

    static void hello() { // Main 클래스 안에 있는 함수, main메서드랑 동급
        System.out.println("hello 실행");
    }
}

class MyClass { // Main 클래스와 분리된 새로운 클래스
    void hi() { // 새로운 클래스 안에 있는 함수 (Main 클래스와 분리)
        System.out.println("hi 실행");
    }
}







