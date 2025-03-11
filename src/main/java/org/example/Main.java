package org.example;

// return 250311

import java.util.Scanner;
class Main {

    static int a = 50;

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); // ctrl + shift + o -> 자동 import
        System.out.println("== 1 ==");
        cal.sum(10, 20);
        System.out.println("== 2 ==");
        System.out.println(cal.sum2(10, 20));
//        System.out.println(cal.sum(10,20)); // return값이 없기 때문에 오류

    }

}

class cal {

    // void는 return을 안할 의무가 있다.
    static void sum(int a, int b) {  // void : output 하지 않는 함수
        System.out.println(a + b); // 출력은 output 이 아님
        return; // return을 하지 않겠다는 의미
    }

    // void를 제외한 나머지는 return을 할 의무가 있다. 무조건 return값을 가짐.
    static int sum2(int a, int b) { // static 뒤에 반환값의 자료형을 작성
        int c = a + b;
        return 0; // 0 => return 밸류
    }

}







