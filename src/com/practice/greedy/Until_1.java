package com.practice.greedy;

import java.util.Scanner;

public class Until_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int cnt = 0;
        while (n >= k) {
            if (n % k == 0) {
                n /= k;
            } else{
                n -= 1;
            }
            cnt += 1;
        }

        while (n > 1) {
            cnt += 1;
        }
        System.out.println(cnt);

    }
}
