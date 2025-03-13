package org.example;

import java.awt.*;
import java.util.Arrays;

// 상속 250313
// 문제 : 자동차 리모콘이 페라리 객체를 가리키게 한 후
// 해당 리모콘이 가리키고 있는 객체를 다시 페라리 리모콘으로 가리키게(참조하게) 하는 코드를 작성해주세요.

class Main {
    public static void main(String[] args) {
        // 수정가능지역 시작

        // case 1
        자동차 자동차리모콘 = new 자동차();
        페라리 페라리리모콘 = 자동차리모콘;
        // 위 코드가 안되는 이유
        // 만약 자동차 클래스를 상속받는 다른 현대클래스가 있을 경우
        // 자동차리모콘이 현대클래스로 만든 객체를 갖고 있다면?

        // case 2
        // 이건 가능
        자동차 자동차리모콘2 = new 페라리();
        페라리 페라리리모콘2 = (페라리) 자동차리모콘2;

        // case 3
        // exception 오류(아마) 실행 후 런타임에서 오류 발생
        // 컴파일러는 알지 못한다.
        자동차 자동차리모콘3 = new 페라리();
        현대 현대리모콘3 = (현대) 자동차리모콘2;

        // 수정가능지역 끝
    }
}
class 자동차 {
    void 달리다() {}
    void 서다() {}
}
class 페라리 extends 자동차 {
    void 뚜껑이_열리다() {}
}
class 현대 extends 자동차 {
    void 멋지다() {}
}
