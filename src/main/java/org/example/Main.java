package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        v4();
    }

    static void v4() {
        System.out.println("==v4==");
        List articles = new ArrayList<>();
        articles.add(new Article()); // index : 0 , id : 1
        articles.add(new Article()); // index : 1 , id : 2
        articles.add(new Article()); // index : 2 , id : 3

        for (int i = 0; i < articles.size(); i++) {
            Article article = (Article) articles.get(i);
            System.out.println(article.id);
        }
    }

    static void v3() {
        System.out.println("==v3==");
        ArrayList articles = new ArrayList<>();
        articles.add(new Article()); // index : 0 , id : 1
        articles.add(new Article()); // index : 1 , id : 2
        articles.add(new Article()); // index : 2 , id : 3
        articles.add(new Article()); // index : 3 , id : 4

        for (int i = 0; i < articles.size(); i++) {
            Article article = (Article) articles.get(i);
            System.out.println(article.id);
        }
    }

    static void v2() {
        System.out.println("==v2==");
        ArrayList articles = new ArrayList();
        articles.add(new Article()); // index : 0 , id : 1
        articles.add(new Article()); // index : 1 , id : 2
        articles.add(new Article()); // index : 2 , id : 3
        articles.add(new Article()); // index : 3 , id : 4

        for (int i = 0; i < articles.size(); i++) {
            Article article = (Article) articles.get(i);
            System.out.println(article.id);
        }
    }

    static void v1() {
        System.out.println("==v1==");
        Article[] articles = new Article[100];

        int articlesSize = 0;

        articles[0] = new Article();
        articlesSize++;
        articles[1] = new Article();
        articlesSize++;
        articles[2] = new Article();
        articlesSize++;
        articles[3] = new Article();
        articlesSize++;
        articles[4] = new Article();
        articlesSize++;

        for (int i = 0; i < articlesSize; i++) {
            System.out.println(articles[i].id);
        }
    }
}

class Article {
    static int lastId;

    int id;
    String regDate;

    static {
        lastId = 0;
    }

    Article() {
        this(lastId + 1, "2025-12-12 12:12:12"); // 다른 생성자 호출(실행), Constructor Call
        lastId++;
    }

    Article(int id, String regDate) {
        this.id = id;
        this.regDate = regDate;
    }
}