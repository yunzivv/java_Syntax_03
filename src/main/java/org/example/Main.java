package org.example;

import java.awt.*;
import java.util.Arrays;

// 소수판별기 풀이 250312

class Main {
    public static void main(String[] args) {
        System.out.println("==== isPrimeNumber 함수 ====");
        boolean result = Math.isPrimeNumber(1);
        System.out.println("1은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(2);
        System.out.println("2은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(3);
        System.out.println("3은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(4);
        System.out.println("4은(는) 소수인가? : " + result);

        System.out.println("\n==== one_to_n_prime_numbers_count 함수 ====");
        // Math. 을 붙이지 않으려면 Main 클래스에 만들면 됨
        int rs = Math.one_to_n_prime_numbers_count(10);
        System.out.println("rs : " + rs);
        // rs : 4
        rs = Math.one_to_n_prime_numbers_count(15);
        System.out.println("rs : " + rs);
        // rs :  6

        System.out.println("\n==== count 함수 ====");
        int countPrime = Math.count(15);
        System.out.println("count rs : " + countPrime);

        countPrime = Math.count(3);
        System.out.println("count rs : " + countPrime);

        countPrime = Math.count(5);
        System.out.println("count rs : " + countPrime);

        System.out.println("\n==== ToPrime 함수 ====");
        countPrime = Math.count(1);
        System.out.println("ToPrime rs : " + countPrime);

        countPrime = Math.count(55);
        System.out.println("ToPrime rs : " + countPrime);

        countPrime = Math.count(3);
        System.out.println("ToPrime rs : " + countPrime);

    }

    static int ToPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count = 0;
            if (i < 2) {
                return 0;
            }

            for (int j = 2; j < i; j++) {
                if (Math.isPrimeNumber(i)) { // 약수 찾았다!
                    count++;
                }
            }
        }
        return count;
    }
}

// isPrimeNumber 다른 방법 1 (약수의 개수)
// 1부터 n까지 나누어 떨어지는 수가 2개라면 -> 소수
// 나누어 떨어지면 count 증가 return count == 2;

// isPrimeNumber 다른 방법 2 (약수의 총합)
// 1부터 n까지 나누어 떨어지는 수의 합이  1 + n이라면
// return sum == 1 + n;

class Math {

    // 입력받은 수가 약수인지 판별하는 함수
    static boolean isPrimeNumber(int n) {
        if (n == 1) { // 매개변수가 1이라면 false
            return false;
        }
        for (int i = 2; i < n; ++i) { // i는 2부터 매개변수 -1까지 증가
            if (n % i == 0) { // 만약 매개변수 % i 가 0이라면(소수가 아니라면) false
                return false;
            }
        }

        return true; // for문을 탈출했다면(i가 n-1까지 증가할 때까지 if문 실행을 안했다면) true
    }


    // 1 ~ 매개변수 사이의 총 약수의 개수를 구하는 함수
    static int count(int i) {
        int count = 0;

        for (int j = 2; j <= i; ++j) { // i는 2부터 매개변수까지 증가
            if (isPrimeNumber(j)) { // i를 인수로 전달하고 isPrimeNumber 실행
                count++; // 만약 함수 결과가 true라면 count 증가
            }
        }
        return count;
    }


    // 첫번째 풀이
    static int one_to_n_prime_numbers_count(int n) {
        int count = 0;

        if (n > 2) {
            count++;
        }

        for (int i = 2; i <= n; ++i) {

            for (int j = 2; j < i; ++j) {

                if (j == i - 1) {
                    count++;
                }
                if (i % j == 0) {
                    break;
                }
            }
        }

        return count;
    }

}
