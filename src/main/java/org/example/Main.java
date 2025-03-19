
package org.example;

// 백준 10807 250319

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int all = sc.nextInt();
        int standard = sc.nextInt();
        int[] numbers = new int[all];
        int count = 0;

        for (int i = 0; i < all; i++){
            numbers[i] = sc.nextInt();
        }

        for(int i = 0; i < all; i++){
            if(numbers[i] < standard){
                System.out.println(numbers[i]);
            }
        }
    }
}
