package org.example;

// 백준 3052 250331

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = Integer.parseInt(sc.nextLine());
        }

        int[] remainder = new int[10];
        for (int i = 0; i < 10; i++) {
            remainder[i] = numbers[i] % 42;
        }
        Arrays.sort(remainder);

        int countRemainder = 1;
        for (int i = 0; i < 9; i++) {
            if(remainder[i] != remainder[i+1])  {
                countRemainder++;
            }

        }
        System.out.println(countRemainder);

        sc.close();
    }
}