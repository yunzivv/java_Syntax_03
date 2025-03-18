
package org.example;

// stream, parse 250317


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        long sum = Arrays.stream(input)
                // 하나하나 Long으로 변경
                // e : 요소
                .mapToLong(e -> Long.parseLong(e))
                .sum();

//        long sum = 0;
//
//        for (String inputData : input) {
//            sum += Long.parseLong((inputData))
//        }

        System.out.println(sum);
    }
}
