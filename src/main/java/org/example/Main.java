package org.example;

import java.awt.*;
import java.util.Arrays;

// 객체리턴 문제 1 250313

// 문제 : 아래가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();

        a사람.나이 = 20;
        a사람.a왼팔 = new 팔();
        System.out.println(a사람.a왼팔);
    }
}

class 사람 {
    // 클래스안에 변수를 정의 할 수 있다.

    int 나이;

    팔 a왼팔;
}

class 팔 {

}