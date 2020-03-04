package com.company;

import java.util.Scanner;

public class Main {

    public static void fibonacci(int count){
        int i=0;
        int j=1;
        int k;
        System.out.println(0);
        System.out.println(1);
        for(int counter=0; counter<count-2; counter++){
            k=i+j;
            System.out.println(k);
            i=j;
            j=k;

        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        fibonacci(9);
	// write your code here
    }
}
