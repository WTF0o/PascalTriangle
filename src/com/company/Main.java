package com.company;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
        int rows = 10;

	    for (int i = 0; i < rows; i++){
            System.out.format("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j < i; j++) {
                System.out.format("%4d",combination(j, i - 1));
            }
            System.out.println();
        }
    }

    public static int combination(int k, int n){
        return fact(n) / (fact(k) * fact(n - k));
    }

    public static int fact(int n){
        if(n == 0) return 1;
        return n * fact(n - 1);
    }
}
