package com.devesh.patternsprograms;

public class PascalTriangleNumber_EvenRow0 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            int k = i - 1;

            for (int j = 1; j <= i + k; j++) {
                System.out.print(i % 2);
            }
            System.out.println();
        }
    }
}



