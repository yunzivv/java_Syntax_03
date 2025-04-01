package org.example;

// 백준 11720 250401

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + Character.getNumericValue(s.charAt(i));
        }
        System.out.println(sum);

        sc.close();
    }
}