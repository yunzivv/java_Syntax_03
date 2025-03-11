package org.example;

// 배열 - class 생성, 객체 연결 250310

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // ctrl + shift + o -> 자동 import

        // 문제 : 자동차 객체를 담을 변수를 만들어주세요.
        car bmw;
        car benz;
        car lexus;

        // 문제 : 자동차 객체를 만들고 변수에 담아주세요.
        bmw = new car();
        benz = new car();
        lexus = new car();

        new car().max = 10; // 일회용 객체. 다시 접근 불가

        // 문제 : 자동차 객체마다 서로 다른 최고속력를 가지도록 해주세요
        bmw.max = 300;
        benz.max = 500;
        lexus.max = 700;

        // 문제 : 1개의 자동차가 3번 달리게 해주세요.
        bmw.run();
        bmw.run();
        bmw.run();

        // 문제 : 3개의 자동차가 각각 1번씩 달리게 해주세요.
        bmw.run();
        benz.run();
        lexus.run();

        // 문제 : 번호가 다른 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.
        bmw.maxrun();
        benz.maxrun();
        lexus.maxrun();

        // 문제 : 번호가 다른 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.
        bmw.num = 1;
        benz.num = 2;
        lexus.num = 3;
        bmw.maxrun();
        benz.maxrun();
        lexus.maxrun();

        // 문제 : 객체를 사용하지 않고 2번째 플레이어를 만들어주세요
        player player1; // 변수 만들고
        player1 = new player(); // (new player())객체 만들고 (=)연결
        // player player1 = new player(); 으로 단축 가능
        player1.age = 20;
        player1.name = "홍길동";
        player1.job = "의적";

        int player2_age = 23;
        String player2_name = "김강민";
        String player2_job = "야구선수";

    }
}

// 문제 : 자동차 설계도를 만들어주세요.
class car {
    int max; // 속성 == 필드
    int num;

    void run() {
        System.out.printf("%d번 자동차가 달립니다.\n", this.num);
    }

    void maxrun() {
        System.out.printf("%d번 자동차가 최고속력 %d로 달립니다.\n", this.num, this.max); // this 생략 가능
    }
}

// 문제 : 객체를 사용하지 않고 2번째 플레이어를 만들어주세요
class player {
    int age;
    String name;
    String job;
}






