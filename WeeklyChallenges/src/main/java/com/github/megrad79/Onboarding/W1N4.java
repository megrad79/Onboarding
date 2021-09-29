package com.github.megrad79.Onboarding;

import java.util.Scanner;


public class W1N4 {
    /*Weekly Coding Activity:
    Please mention the link to your solution in the comments section.

    2)JavaScript:
    Write a code to convert an Object {} into an Array [] in JavaScript?

    4)Python:
    Given a character matrix where every cell has one of the following values.

    'C' --> This cell has coin

    '#' --> This cell is a blocking cell.
    We can not go anywhere from this.

    'E' --> This cell is empty. We don't get
    a coin, but we can move from here.
    Initial position is cell (0, 0) and initial direction is right.

    Following are rules for movements across cells.

    If face is Right, then we can move to below cells

    - Move one step ahead, i.e., cell (i, j+1) and direction remains right.
    - Move one step down and face left, i.e., cell (i+1, j) and direction becomes left.

    If face is Left, then we can move to below cells
    - Move one step ahead, i.e., cell (i, j-1) and direction remains left.
    - Move one step down and face right, i.e., cell (i+1, j) and direction becomes right.

    Final position can be anywhere and final direction can also be anything. The target is to collect maximum coins.

    5) Java, Python, C# and JS:

    We are given N items which are of total K different colors. Items of the same color are indistinguishable and colors can be numbered from 1 to K and count of items of each color is also given as k1, k2 and so on. Now we need to arrange these items one by one under a constraint that the last item of color i comes before the last item of color (i + 1) for all possible colors. Our goal is to find out how many ways this can be achieved.

    Examples:
    Input : N = 3
    k1 = 1 k2 = 2
    Output : 2
    Explanation :
    Possible ways to arrange are,
    k1, k2, k2
    k2, k1, k2

    Input : N = 4
    k1 = 2 k2 = 2
    Output : 3
    Explanation :
    Possible ways to arrange are,
    k1, k2, k1, k2
    k1, k1, k2, k2
    k2, k1, k1, k2*/


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
