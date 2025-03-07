package org.example;

// 객체 250307

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr; // 정수들만 담을 수 있는 객체의 리모컨을 담는 변수 arr 생성
        arr = new int[5]; // arr 변수에 int[5](리모컨)로 만든 객체의 리모컨 대입
        int j = 10;
        for(int i = 0; i < arr.length; i++){
            arr[i] = j; // arr[i] = arr[i-1] + 10 // (i + 1) * 10
            j += 10;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%d\n", arr[i]);
        }
    }

}


