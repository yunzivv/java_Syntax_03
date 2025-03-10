package org.example;

// 배열 - 2차원 배열, 3차원 배열 250310

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 10; // 점

        int[] arr = new int [3]; // 선, liner : 선형구조를 가짐

        int[][] arr2nd = new int [2][3]; // 면 3개씩 2묶음, 2d 2차원배열, 테이블 형태

        int[][][] arr3nd = new int [3][3][3]; // 입체형 3d 3차원배열, 육면체 형태

        // d : dimension 차원

        // hip 영역 : 랜덤으로 메모리 할당
        // stack 영역 : 순차적으로 메모리 할당, 쌓임

        // (hip 영역에 만들어진)객체(object) == 인스턴스 == 폴더
        // 객체 안에 있는 변수처럼 동작하는 공간 == 인스턴스 변수
        // (hip 영역에 만들어지지 않은 객체)클래스 == 인스턴스 설계도 == 객체 설계도 == 폴도 설계도 == 설계도

    }

}


