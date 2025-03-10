package org.example;

// 배열 - class 생성, 객체 연결 250310

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // ctrl + shift + o -> 자동 import

        member a1 = new member();
        a1.age = 22;
        a1.name = "류현진";
        a1.isMarried = false;
        a1.hello(); // 클래스 내의 함수 호출하여 사용
        a1.introduce();

        member a2 = new member();
        a2.age = 24;
        a2.name = "박영수";
        a2.isMarried = true;
        a2.introduce();


    }
}

class member {
    int age;
    String name;
    boolean isMarried;

    void hello() { // 함수 정의 / 메서드는 개수 제한이 없음
        System.out.println("안녕하시오");
    }

    void introduce() {
        int age = this.age; // class의 age와 스코프가 다르다.
        System.out.printf("내 이름은 %s\n", this.name);
        System.out.printf("나이는 %d살\n", age);
        System.out.printf("결혼여부는 %b\n\n", this.isMarried);
    }
}


