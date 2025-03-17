
package org.example;

// Scanner 250317

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        while(true) {

            try {
                a = sc.nextInt(); // 프로그램을 실행하면 정수를 입력하고 엔터를 누를 때 까지 프로세스는 대기
                sc.nextLine(); // 버퍼를 비우기 위한 용도
                break;
            } catch (InputMismatchException e) {
                System.out.println("다시 숫자로 써주라");
                sc.nextLine(); // 버퍼를 비우기 위한 용도
            }
        }

        System.out.println(a);

    }
}

