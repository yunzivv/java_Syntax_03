package org.example;

// try-catch 250314

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int result = 계산기.나누기(10, 0);
        System.out.println(result); // 이게 오류가 발생하면 이 다음의 코드가 실행이 안됨
        System.out.println(1); // 이걸 실행시키기 위해 try catch 사용

    }
}

// case 1
class 계산기 {
    static int 나누기(int a, int b) {

        int rs = 0;

        try {
            rs = a / b;
            return rs;
        } catch (ArithmeticException e){
            System.out.println("나누기 할 수 없어");
            return 0;
        } finally {
            System.out.println("어쨋든 하긴햇어..");
        }
    }
}

// case 2
class 계산기1 {

    // 함수를 호출할 때 주의할 사항을 throw 오류상황 / 이렇게 작성
    static int 나누기(int a, int b) throws ArithmeticException{ // 개조심
        int rs = 0;

        rs = a / b;
        return rs;
    }
}
