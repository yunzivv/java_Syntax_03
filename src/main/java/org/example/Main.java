package org.example;

import java.awt.*;
import java.util.Arrays;

// abstract 250312


class Main {
    public static void main(String[] args) {

        double a = 1;
        System.out.println(a); // 1.0 출력 자동 형변환

        int i = (int)1.9;
        System.out.println(i); // 1 출력 강제 형변환 소수점 아래를 버린다.

        무기 a무기 = new 칼(); // 무기 리모컨만 담을 수 있는 a무기 변수에 칼 객체를 만들어서 연결
        a무기.공격(); // 소수점 아래를 버리는 것처럼 공격 메서드를 버림. 무기의 모양을 갖기 위해서
                      // 무기에는 공격 메서드가 없다.
        a무기.방어(); // 무기에는 방 메서드가 있지만 칼 클래스에서 메서드를 재정의 했기 때문에 칼막기 출력
    }
}

// 추상 메서드를 하나 이상 가진 클래스는 추상 클래스로 작성해야한다.
abstract class 무기 { // 추상 클래스
    abstract void 공격(); // 추상 메서드. 오버라이딩이 필수. 의도(구현하지마)만 알면 됨

    void 방어() { // 구상 메서드
        System.out.println("무기 방어");
    }
}


// 구상 클래스 :
class 칼 extends 무기 { // 구상 클래스

    // abstract 메서드를 받았다면 해당 메서드는 오버라이딩을 꼭 해야함
    void 공격() { // 구상 메서드
        System.out.println("칼 공격");
    }
    void 방어() { // 메서드 오버라이딩
        System.out.println("칼 방어");
    }
}

// 클래스 내의 모든 메서드가 abstract 메서드라면 interface 클래스명
interface 무기2 {
    abstract void 공격();
    abstract void 방어();
}

class 총 implements 무기, 무기2 { // 구상 클래스

    // abstract 메서드를 받았다면 해당 메서드는 오버라이딩을 꼭 해야함
    public void 공격() { // 구상 메서드
        System.out.println("총 공격");
    }
    public void 방어() { // 메서드 오버라이딩
        System.out.println("총 방어");
    }
}

