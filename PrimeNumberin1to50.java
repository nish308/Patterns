package com.devesh.patternsprograms;

public class PrimeNumberin1to50 {
    public static void main(String[] args) {
        for (int i=1;i<=50;i++){
            int count=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.println(i);
            }
        }
    }
}
