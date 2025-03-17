
package org.example;

// 백준 25314 250317

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fourLong =  sc.nextInt();
        int count = fourLong/4;

        for (int i = 0; i < count; i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}