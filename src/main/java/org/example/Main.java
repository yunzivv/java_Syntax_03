
package org.example;

// 백준 2525 250317

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();

        h += (m + t) / 60;
        m = (m + t) % 60;

        if (h >= 24) {
            h -= 24;
        }

        System.out.println(h);
        System.out.println(m);

    }
}