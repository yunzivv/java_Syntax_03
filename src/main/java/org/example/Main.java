
package org.example;

// 백준 2438 250317

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int starline = sc.nextInt();

        for (int i = 1; i <= starline; i++){
            for (int count = 1; count <= i; count++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
