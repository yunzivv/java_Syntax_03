
package org.example;

// 백준 2739 250317

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dan = sc.nextInt();

        for (int i = 1; i < 10; i++){
            System.out.printf("%d * %d = %d\n", dan, i , dan*i);
        }

    }
}