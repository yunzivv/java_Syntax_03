
package org.example;

// 백준 2439 250317

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int starline = sc.nextInt();

        for (int i = 1; i <= starline; i++){
            for (int space = starline - 1; space >= i; space--){
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
