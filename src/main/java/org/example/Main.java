package org.example;

import java.awt.*;
import java.util.Arrays;

// 객체 리턴 250313
// 문제 : 자동차 리모콘이 페라리 객체를 가리키게 한 후
// 해당 리모콘이 가리키고 있는 객체를 다시 페라리 리모콘으로 가리키게(참조하게) 하는 코드를 작성해주세요.


//올바른 리턴타입으로 메서드를 만들어주세요
public class Main {
    public static void main(String[] args) {
        int i = 로봇.get정수();
        boolean b = 로봇.get논리();
        사람 a사람 = 로봇.get사람();
        사람 a사람2 = 로봇.get사람2();
        사람 a사람3 = 로봇.get사람3();
        사람 a사람4 = 로봇.get사람4();
        사람 a사람5 = 로봇.get사람5(123, false);
        System.out.println(a사람5.number);
        로봇.get사람6(123, false);

    }


}

class 로봇 {
    static int get정수() {
        return 0;
    }

    static boolean get논리() {
        return false;
    }

    static 사람 get사람() { // 객체를 반환하는 함수
        return null; // 기본타입 빼고 반환 가능
    }

    static 사람 get사람2() {
        return new 사람(); // 객체를 만들어서 반환 가능
    }

    static 사람 get사람3() {
        사람 a = null;
        return a; //
    }

    static 사람 get사람4() {
        사람 b = new 사람();
        return b;
    }

    static 사람 get사람5(int i, boolean b) {
        사람 c = new 사람();
        c.number = i;
        c.check = b;

        return c;
    }

    static void get사람6(int i, boolean b) {
        return; // void도 return 스테이트먼트를 가질 수 있지만 반환값은 없는 상태 -> 안해도 무방
    }

}

class 사람 {
    int number; // get사람5를 위해 작성
    boolean check; // get사람5를 위해 작성
}