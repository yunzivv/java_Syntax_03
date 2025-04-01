package org.example;

// 백준 9086 250401

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            int len = str[i].length() - 1;
            System.out.print(str[i].charAt(0));
            System.out.println(str[i].substring(len));
        }

        sc.close();
    }
}