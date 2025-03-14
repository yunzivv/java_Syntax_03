package org.example;



// ArrayList 250314

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Number> l = new ArrayList<>(); // 동적 할당(dynamic allocation)
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);
        System.out.println("====================");

        l.remove(3);
        System.out.println(l); // [10, 20, 30, 50]

    }

}

