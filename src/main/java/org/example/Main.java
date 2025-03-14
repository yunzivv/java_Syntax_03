package org.example;

// ASCII Code 250314

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println((int)'1');
        System.out.println(isHanguel(' '));
        System.out.println(isHanguel('안'));
        System.out.println(isHanguel('녕'));
        System.out.println(isHanguel('하'));
        System.out.println(isHanguel('세'));
        System.out.println(isHanguel('요'));
        System.out.println(isHanguel('.'));

    }
    static boolean isHanguel(char c){

        return c >= '가' && c <= '힣'; // 44032 ~ 55204 총 11172개
    }
}

