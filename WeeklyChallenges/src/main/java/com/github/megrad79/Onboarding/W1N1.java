package com.github.megrad79.Onboarding;

import java.util.Scanner;


public class W1N1 {

    public static void main(String[] args){
        System.out.println("Hello!");
        System.out.println("Please choose a integer between 9 and 100, noninclusive.");

        /*
        1)Java:
        Write a Java Program to swap two numbers without using the third variable.

        Write code in such a way that no deadlock should occur. The trick to solving this problem is acquiring resources in
        order and release them in reverse order, e.g. first acquire resource R1 and only if you have got R1 to go for R2.
        This way, you can avoid deadlock.
        */

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 10 & num < 100){
            String S = String.valueOf(num);
            char[] dig = S.toCharArray();

            char a = dig[1];
            char b = dig[0];

            int A = Character.getNumericValue(a);
            int B = Character.getNumericValue(b);

            System.out.print(A);
            System.out.print(B);
        }
        else {
            System.out.println("Sorry... Please try again and choose a 2-digit integer between 9 and 100, noninclusive.");
        }
    }
}
