package org.example;

import java.awt.*;
import java.util.Arrays;

// 객체리턴 문제 250313

// 문제 : 아래가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "진";
        a전사.자기소개();

        a전사.a무기 = new 활(); //
        a전사.공격();
        //출력 : 진이 활로 공격합니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        //출력 : 진이 칼로 공격합니다.
    }
}

class 전사 {
    // 인스턴스 변수
    String 이름;
    // 인스턴스 변수
    int 나이;
    // 인스턴스 변수
    무기 a무기; // 객체를 갖고 있음

    // 1번 풀이 -> 오류
    // String 무기이름 = (String) a무기;
    // 전사 클래스 안에서 무기명이 정의가 되어야함

    // 2번 풀이 -> 오류
    // 무기 클래스에 무기명이 없다.
    //String 무기명 = this.a무기.무기명();


    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }

//    3번 풀이 -> 오류
//    2번과 같음
//    void 공격(){
//        System.out.println(this.이름 + "이 " + this.a무기.무기명 + "로 공격합니다.");
//    }

    void 공격() {
        String 공격자 = this.이름;
        this.a무기.공격();

        // 내 풀이
//        System.out.print(this.이름 + "이 ");
//        this.a무기.공격();

    }
}

abstract class 무기 {
    String 공격자;
    abstract void 공격(); // abstract 메서드를 만들어 하위 클래스의 메서드를 사용할 수 있게

}

class 칼 extends 무기 {
    void 공격() {
        System.out.println(this.공격자 + "가 칼로 공격합니다.");
    }
}

class 활 extends 무기 {
    void 공격() {
        System.out.println(this.공격자 + "가 활로 공격합니다.");
    }
}