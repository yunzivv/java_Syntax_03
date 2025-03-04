package org.example; // 없으면 안됨

// 문제 : 아래와 같이 출력해주세요.

class Main {
    public static void main(String[] args) {
        System.out.println("=== 1 ===");
        System.out.println("8 * 1 = 8\n" +
                "8 * 2 = 16\n" +
                "8 * 3 = 24\n" +
                "8 * 4 = 32\n" +
                "8 * 5 = 40\n" +
                "8 * 6 = 48\n" +
                "8 * 7 = 56\n" +
                "8 * 8 = 64\n" +
                "8 * 9 = 72");

        System.out.println("=== 2 ===");
        int dan = 8;
        System.out.println(dan + " * 1 = 8");
        System.out.println(dan + " * 2 = 16");
        System.out.println(dan + " * 3 = 24");
        System.out.println(dan + " * 4 = 32");
        System.out.println(dan + " * 5 = 40");
        System.out.println(dan + " * 6 = 48");
        System.out.println(dan + " * 7 = 56");
        System.out.println(dan + " * 8 = 64");
        System.out.println(dan + " * 9 = 72");


        System.out.println("=== 3 ===");
        System.out.println(dan + " * 1 = " + dan * 1);
        System.out.println(dan + " * 2 = " + dan * 2);
        System.out.println(dan + " * 3 = " + dan * 3);
        System.out.println(dan + " * 4 = " + dan * 4);
        System.out.println(dan + " * 5 = " + dan * 5);
        System.out.println(dan + " * 6 = " + dan * 6);
        System.out.println(dan + " * 7 = " + dan * 7);
        System.out.println(dan + " * 8 = " + dan * 8);
        System.out.println(dan + " * 9 = " + dan * 9);


        System.out.println("=== 4 ===");
        int i = 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i += 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i += 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i += 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i += 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i += 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i += 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i += 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i += 1;
        System.out.println(dan + " * " + i + " = " + dan * i);


    }
}