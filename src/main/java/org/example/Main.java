package org.example;

import java.awt.*;
import java.util.Arrays;

// 객체리턴 문제 250313

class Main {
    public static void main(String[] args) {

        System.out.println("=== 개구리1 정보 ===");
        개구리 개구리1 = new 개구리("keroro", 10500);
        System.out.println("개구리1 이름 : " + 개구리1.이름);
        System.out.println("개구리1 나이 : " + 개구리1.나이);

        System.out.println("\n=== 개구리2 정보 ===");
        개구리 개구리2 = new 개구리("쿠루루", 6000);
        System.out.println("개구리2 이름 : " + 개구리2.이름);
        System.out.println("개구리2 나이 : " + 개구리2.나이);

        System.out.println("\n=== 개구리3 정보 ===");
        개구리 개구리3 = new 개구리("타마마");
        System.out.println("개구리3 이름 : " + 개구리3.이름);
        System.out.println("개구리3 나이 : " + 개구리3.나이);

        System.out.println("\n=== 하위 클래스 객체 생성 ===");
        개구리 개구리4 = new 도로로();

    }
}

class 개구리 {

    String 이름;
    long 나이;

    // 생성자 : 객체가 생성될 때 자동으로 실행되는 메서드
    // 생성자 메서드를 작성하지 않으면 자동으로 생성자메서드가 생김(있는 걸로 인식)
    // 생성자 이름은 클래스 이름을 따라야한다.
    // return타입은 없지만 void를 선언하지도 않는다.
    // 일반함수 취급해도 되지만 수동 실행이 아니고 객체를 생성할 때(new키워드 쓸 때) 자동 실행이된다.
    개구리(String 이름, int 나이){
        this.이름 = 이름;
        this.나이 = 나이;
    }
    // 생성자는 오버로딩이 가능하다.
    // 메서드 시그니처가 다른 경우 다른 함수로 취급한다.
    // 아래 생성자는 위의 생성자랑 매개변수 갯수가 다르다.
    개구리(String 이름){
        this.이름 = 이름;
        System.out.println("나이를 입력받지 않음");
    }

    개구리() {
        System.out.println("개구리 생성자 실행");
    }

}

class 도로로 extends 개구리 {
    도로로 () {
        System.out.println("도로로 생성자 실행");
    }
}