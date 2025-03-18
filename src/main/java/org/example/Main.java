
package org.example;

// 백준 2439 250317

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        int lastindex = 0;

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            numbers.add(a);
            numbers.add(b);
            if (a == 0 && b == 0) {
                break;
            }
        }
        int size = numbers.size();
        for (int i = 0; i < (numbers.size() - 2) / 2; i++) {
            int sum = numbers.get(lastindex) + numbers.get(lastindex + 1);
            System.out.println(sum);
            lastindex += 2;
        }
    }
}
