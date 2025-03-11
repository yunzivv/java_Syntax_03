package org.example;

import java.awt.*;
import java.util.Arrays;

// 객체 활용과 풀이 250311

class Main {
    public static void main(String[] args) {
        String msg = greet("Jin");
        // msg 변수에 greet 메서드를 실행한 return값을 담는다.
        // 메서드에 넘겨줄 인수는 'Jin'이다
        System.out.println(msg); // 예상 출력 : Hello, Jin!

        Point point = createPoint(5, 10); // = new Point(5, 10)
        // Point 는 이미 있는 클래스 : 좌표를 나타냄
        System.out.println("Point create at (" + point.x + ", " + point.y + ")");

        int[] evens = firstNEvenNumbers(5);
        // evens 배열에 firstNEvenNumbers 메서드를 실행한 return값을 담는다.
        // 메서드에 넘겨줄 인수는 '5'다.
        System.out.println(evens);
        // 리모컨을 갖고 있기 때문에 주소 출력
        System.out.println("first 5 even numbers : " + Arrays.toString(evens));
        // Arrays 객체의 toSrting메서드를 활용해서 evens를 출력한다.
        // toString메서드는 정수배열을 매개변수로 한다.
    }

    // 외부에서 사용 가능한 static 메서드
    public static String greet(String name) { // 문자열 Jin을 매개변수로 받아 name변수로 활용한다.
        return "Hello, " + name + "!";
    }

    public static Point createPoint(int x, int y) {
        return new Point(x, y);
    }

    public static int[] firstNEvenNumbers(int n) { // 정수 5를 매개변수로 받아 n변수로 활용한다.
        int[] evenNumbers = new int[n]; // 정수배열 evenNumbers의 길이는 5다.

        for (int i = 0, num = 2; i < n; i++, num += 2) {
            // 정수형 변수 i와 num을 선언하고 for문 안에서 i는 0부터 n까지 즉, 5까지 1씩 증가하고,
            // num은 i가 n보다 작은 동안 2부터 2씩 증가한다.
            evenNumbers[i] = num; // evenNumbers배열에 순차적으로 2부터 짝수가 5개 저장된다.
            // evenNumbers = {2, 4, 6, 8, 10}
        }
        return evenNumbers; // 저장된 evenNumbers 배열을 반환한다.
    }
}