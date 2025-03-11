package org.example;

// static 메서드와 Non static 메서드-2 250311

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in); // ctrl + shift + o -> 자동 import
        // 1. 객체와 변수를 만들고 연결해서 MyClass 접근
        MyClass a = new MyClass();
        a.wow = 101;
        System.out.println("== 1. 객체 생성하고 a 변수에 연결 ==");
        a.hi();

        //2. 객체를 변수에 대입하지 않고 일회용 객체로 MyClass 접근
        System.out.println("\n== 2. 변수 연결 없는 객체 생성(일회용 객체) ==");
        new MyClass().hi();

        //3. 객체를 만들지 않고 MyClass의 static 함수 실행
        System.out.println("\n== 객체, 변수 없이 MyClass 함수 실행 ==");
        MyClass.hi2();

    }

    static void hello() { //
        System.out.println("hello 실행");
    }
}

class MyClass {
    int wow;
    // 인스턴스 메서드
    void hi() { // Non Static
        System.out.println("hi 메서드 실행, wow는 : " + this.wow);
    }
    // 클래스 메서드
    // 메서드 내부에서 인스턴스 변수를 사용할 수 없음
    static void hi2() { // Static : 객체화 없이 사용 가능. 설계도 차원에서 기능 뽑아서 사용 가능
        System.out.println("hi2 실행");
    }
}







