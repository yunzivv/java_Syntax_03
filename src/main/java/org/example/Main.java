
package org.example;

// stream, filter, map 사용해서 홀수 걸러내기2 250317


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


class Main {
    public static void main(String[] args) {
        // 일반
        int[] arr = {33, 2, 55, 4, 51, 6, 71, 18, 29, 10};

        List<Integer> resultAl = new ArrayList<>();

        // filter 시작
        for (int n : arr) if (n % 2 == 0) resultAl.add(n);
        // filter 끝

        // map 시작
        for (int i = 0; i < resultAl.size(); i++) {
            int newValue = resultAl.get(i) * 2;
            resultAl.set(i, newValue);
        }
        // map 끝

        System.out.println(resultAl);

        // 스트림
        arr = new int[]{33, 2, 55, 4, 51, 6, 71, 18, 29, 10};

        resultAl = Arrays
                .stream(arr)
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(resultAl);
    }
}
