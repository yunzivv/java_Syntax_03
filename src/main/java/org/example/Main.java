package org.example;

// 변수 - 전역변수, 지역변수, 매개변수  250311

import java.util.Scanner;
class Main {

    int aa = 30; //static이 아닌 전역변수
    static int a = 50; // static 전역변수

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); // ctrl + shift + o -> 자동 import
        System.out.println(a); // a = 9행의 전역변수

        int aa = 55;
        System.out.println(aa); // a = 15행의 지역변수

        ex();

        cal.sum();

        cal.sum(10, 20); // 괄호 안의 10, 20 인수(argument)을 sum 함수로 넘겨줌
        cal.sum(30, 40); // 함수에서 받을 매개변수의 개수와 자료형을 맞춰줘야함, 순서대로 매치

    }

    public static void ex() {
        System.out.println(a); // a = 9행의 전역변수
    }
}

class cal {

    static void sum() {
        System.out.println("a + b");
    }

    static void sum(int a) {
        System.out.println("a + b");
    }

    static void sum(int a, int b) { // (int a, int b) => 매개변수(parameter), 함수 내부와 외부를 연결하는 매개체
//        int a = 10; // 매개변수는 지역변수의 일종, a는 이미 선언되어 있음
        System.out.println(a + b);
    }

    // sum()과 sum(int a, int b)의 함수명이 같음에도 오류가 나지 않는 이유
    // 메서드 시그니처가 다르기 때문
    // 메서드 시그니처 : 함수명 + 매개변수 (매개변수의 변수명은 관련 없음)

    // 다형성(Polymorphism) 중에 오버로딩 상황이다

}







