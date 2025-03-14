package org.example;

// 문자열비교 250314

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        String s = new String("케");
        // 사실 위의 모양임
        String s = "케";
        char c ='케';

        // 배열임, 첫번째 글자에 대한 주소가 저장됨
        String keroro = "keroro"; // k + e + r + o + r + o

        String kururu = "keroro";

        String tamama = "kero";
        tamama += "ro";

        System.out.println(keroro == kururu);
        System.out.println(keroro == tamama);
        System.out.println(keroro.equals(tamama)); // 값을 비교

    }
}

