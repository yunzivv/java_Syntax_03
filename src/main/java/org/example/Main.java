package org.example;

import java.awt.*;
import java.util.Arrays;

// 클래스 변수 250314

class Main {
    public static void main(String[] args) {

        Article article1 = new Article();
        System.out.println(article1.id);
        Article article2 = new Article();
        System.out.println(article2.id);
        Article article3 = new Article();
        System.out.println(article3.id);

    }
}

class Article {
    static int lastid;
    int id = 1;
    String regData;

    static  { // 클래스 변수 전용 생성자
        lastid = 0; // 이거 왜 여기서 초기화?
    }

    Article() {
        // 다른 생성자 호출(constructor Call)
        this(lastid + 1, "데이터"); // 이 데이터는 아래 생성자의 인수가 됨
        lastid++ ;
    }

    Article(int id, String regData) { // 호출한 생성자의 this의 인수를 매개변수로
        this.id = id;
        this.regData = regData;

    }
}

