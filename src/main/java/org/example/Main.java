
package org.example;

// 여러가지 stream 250317


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        // 일반
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 스트림
        IntStream.rangeClosed(1, 10)
                .forEach(e -> {
                    System.out.println(e);
                });

        // 스트림
        IntStream.rangeClosed(1, 10)
                .forEach(e -> System.out.println(e));

        // 스트림
        IntStream.rangeClosed(1, 10)
                .forEach(System.out::println);
    }
}

class Main2 {
    public static void main(String[] args) {
        // 일반
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }

        System.out.println(Arrays.toString(arr));

        // 스트림
        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] resultArr = Arrays.stream(arr)
                .map(e -> {
                    return e * 2;
                })
                .toArray();

        resultArr = Arrays.stream(arr)
                .map(e -> e * 2) // 이런식으로 줄여쓸 수 있다.
                .toArray();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(resultArr));
    }
}
