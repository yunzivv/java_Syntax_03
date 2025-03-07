package org.example;

// 배열 생성과 값 대입 250307

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean[] arr1 = new boolean[3]; // 바로 대입하는 법?
        double[] arr2 = new double[3];
        int[] arr3 = new int[10];

        arr1[0] = true;
        arr1[1] = false;
        arr1[2] = true;

        arr2[0] = 3.14;
        arr2[1] = 7.77;
        arr2[2] = 11.11;

        for (int i = 0; i < arr3.length; i++){
            arr3[i] = i + 1;

        }

        System.out.println("= arr1 출력 =");
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
        System.out.println("= arr2 출력 =");
        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
        System.out.println("= arr3 출력 =");
        for (int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i]);
        }
    }

}


