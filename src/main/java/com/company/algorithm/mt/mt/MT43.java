package com.company.algorithm.mt.mt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MT43 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        if (s % 3 == 1) {
            for (int i = 0; i < s / 3; i++) {
                sb.append(12);
            }
            sb.append(1);
        } else if (s % 3 == 2) {
            for (int i = 0; i < s / 3; i++) {
                sb.append(21);
            }
            sb.append(2);
        } else {
            for (int i = 0; i < s / 3; i++) {
                sb.append(21);
            }
        }
        System.out.println(sb.toString());
    }
}
