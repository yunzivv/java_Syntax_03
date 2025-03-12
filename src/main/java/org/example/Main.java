package org.example;

import java.awt.*;
import java.util.Arrays;

// 클래스와this 문제 250312


// 문제 1 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.
// 문제 2 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요. 마지막 공격방식을 기억

// 강의 28강 보기

class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();


        a전사.공격("브라이언", "칼");
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.재공격();
        // 브라이언이(가) 칼(으)로 공격합니다.


        a전사.공격("필립", "창");
        // 필립이(가) 창(으)로 공격합니다.


        a전사.공격("마크", "지팡이");
        // 마크(가) 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(가) 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(가) 지팡이(으)로 공격합니다.
    }
}

class 전사 {
    String name;
    String tool;

    void 공격 (String name, String tool){
        this.name = name; // this 생략 가능
        this.tool = tool;
        System.out.println(name + "(이)가 " + tool + "(으)로 공격합니다.");
    }
    void 재공격 (){
        System.out.println(this.name + "(이)가 " + this.tool + "(으)로 공격합니다."); // this 생략 가능
    }
}