
package org.example;

// 종합문제 250315
// ArrayList 사용 버전2

import java.util.ArrayList;
import java.util.List;

// 문제 : 아래가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33); // add사람 메서드는 사람 인스턴스를 생성한다.
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

    private int num = 0;
    private String name;
    private int age;
    private ArrayList<사람> members = new ArrayList<>();

    void add사람(String name, int age){

        num++;
        사람 사람인스턴스 = new 사람(this.num, name, age);
        members.add(사람인스턴스);

        System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n", age, this.num, name);
    }

    사람 get사람(int i) {
        return members.get(i-1);
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

