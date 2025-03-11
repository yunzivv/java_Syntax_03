package org.example;

import java.awt.*;
import java.util.Arrays;

// 소수판별기 250311

class Main {
    public static void main(String[] args) {
        boolean result = Math.isPrimeNumber(1);
        System.out.println("1은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(2);
        System.out.println("2은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(3);
        System.out.println("3은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(4);
        System.out.println("4은(는) 소수인가? : " + result);

        int rs = Math.one_to_n_prime_numbers_count(10);
        System.out.println("rs : " + rs);
        // rs : 4
        rs = Math.one_to_n_prime_numbers_count(15);
        System.out.println("rs : " + rs);
        // rs :  6

        int countPrime = Math.count(15);
        System.out.println(countPrime);


    }
}

class Math {
    static boolean isPrimeNumber(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 1; i < n; ++i) {
            if (i != 1 && n % i == 0) {
                return false;
            }
        }

        return true;
    }


    static int count(int i) {
        int count = 0;

        for(int j = 2; j <= i; ++j){
            if(isPrimeNumber(j)){
                count++;
            }
        }
        return count;
    }


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













