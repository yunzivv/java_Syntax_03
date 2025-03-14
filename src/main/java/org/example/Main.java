package org.example;

// 종합문제 푸는 중 250314
// Array List가 3개나 존재할 필요 없다.
// 수정해보기

import java.util.ArrayList;
import java.util.List;

// 문제 : 아래가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.
        a사람인력관리소.add사람("케로로", 10);


        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.

        사람 a사람4 = a사람인력관리소.get사람(4);
        a사람4.자기소개();
    }
}

class 사람인력관리소 {

    static int num = 0;
    static String name;
    static int age;
    static ArrayList<Integer> numbers = new ArrayList<>();
    static ArrayList<String> names = new ArrayList<>();
    static ArrayList<Integer> ages = new ArrayList<>();


    void add사람(String name, int age){

        num++;
        numbers.add(num);
        names.add(name);
        ages.add(age);

        System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n", age, num, name);
    }

    사람 get사람(int i) {
        i -= 1;
        return new 사람(numbers.get(i), names.get(i), ages.get(i));
    }
}

class 사람 {

    private int num;
    private String name;
    private int age;

    사람(int num, String name, int age){
        this.num = num;
        this.name = name;
        this.age = age;
    }

    void 자기소개() {
        System.out.printf("저는 %d번, %s, %d살입니다.\n", this.num, this.name, this.age);
    }

}
