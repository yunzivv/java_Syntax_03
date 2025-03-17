
package org.example;

// 백준 11021 250317

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();
        int[] numbers = new int[testcase * 2];
        int sum;
        int lastindex = 0;

        for (int i = 0; i < testcase * 2; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int count = 0; count < testcase; count++) {
            sum = numbers[lastindex] + numbers[lastindex + 1];
            System.out.printf("Case #%d: %d\n", count + 1, sum);
            lastindex += 2;
        }
    }
}