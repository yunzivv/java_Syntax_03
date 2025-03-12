package org.example;

import java.awt.*;
import java.util.Arrays;

// 상속 250312

class Main {
    public static void main(String[] args) {

        cat white = new cat();
        white.sleep(); //


        dog yellow = new dog();


    }


}

// 객체지향 언어
// - 코드를 줄이고 재사용할 수 있는데 초점이 맞춰진 언어

// 상위 클래스 == 부모 클래스 == 슈퍼 클래스
class animal {

    // 아래 코드를 재사용할 수 있다.
    void jump( ) {
    }
    void sleep ( ) {
    }
    void eat ( ) {
    }

}

// 하위 클래스 == 자식 클래스 == 서브 클래스
// extends animal : animal 클래스의 속성과 기능을 상속받는다.
class cat extends animal {
    void meow ( ) {

    // jump, sleep, eat 메서드를 가지고 있음

    }
}

// 하위 클래스 == 자식 클래스 == 서브 클래스
class dog extends animal {

    void bow ( ) {

    }
}




