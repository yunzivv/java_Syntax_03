package org.example;

// 배열 생성과 값 대입 250307

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean[] arr1 = {true, false, true}; // 바로 대입하는 법?
//        arr1[0] = true;
//        arr1[1] = false;
//        arr1[2] = true;
        System.out.println(arr1); // arr1의 주소값 출력

        arr1 = new boolean[3]; // 같은 변수에 새로운 배열 대입 가능

        double[] arr2 = new double[3];
        arr2[0] = 3.14;
        arr2[1] = 7.77;
        arr2[2] = 11.11;


        int[] arr3 = new int[10];
        for (int i = 0; i < arr3.length; i++){ // i는 for문 탈출하면 죽음...rip
            arr3[i] = i + 1; // 여기에 출력문 작성해도 됨
        }

        int[] arr4 = new int[]{1,3,5,7};


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
        System.out.println("= arr4 출력 =");
        for (int i = 0; i < arr4.length; i++){
            System.out.println(arr4[i]);
        }
    }

}


