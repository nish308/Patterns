package com.devesh.patternsprograms;

public class PascalTriangleNumber_Increase_Middle_Thendecrease {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            int k = i - 1;
            int num=1;
            for (int j = 1; j <= i + k; j++) {
               if (j<=i){
                   System.out.print(num);
                   num++;
               }else{
                   num--;
                   System.out.print(num-1);
               }
            }
            System.out.println();
        }
    }
}
