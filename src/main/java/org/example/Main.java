package org.example;

// 백준 5597 250324

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[28];
        ArrayList<Integer> no = new ArrayList<>();

        for (int i = 0; i < 28; i++) {
            numbers[i] = Integer.parseInt(sc.nextLine());
        }

        boolean check;
        for (int i = 1; i <= 30; i++) {
            check = true;
            for (int n : numbers) {
                if (n == i) {
                    check = false;
                    break;
                }
            }
            if (check) {
                no.add(i);
            }
        }

        if(no.get(0) > no.get(1)) {
            System.out.println(no.get(1));
            System.out.println(no.get(0));
        } else {
            System.out.println(no.get(0));
            System.out.println(no.get(1));
        }

        sc.close();
    }
}