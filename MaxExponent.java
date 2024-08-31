/*
Problem Statement

You are given a function,

Int MaxExponents (int a , int b);

You have to find and return the number between ‘a’ and ‘b’ ( range inclusive on both ends) 
which has the maximum exponent of 2.

The algorithm to find the number with maximum exponent of 2 between the given range is

1. Loop between ‘a’ and ‘b’. Let the looping variable be ‘i’.

2. Find the exponent (power) of 2 for each ‘i’ and store the number with maximum exponent of 2 
so far in a variable, let say ‘max’. Set ‘max’ to ‘i’ only if ‘i’ has more exponent of 2 than ‘max’.

3. Return ‘max’.

Assumption: a < b

Note: If two or more numbers in the range have the same exponents of  2 , return the small number.

Example

Input:

7
12

Output: 8

Explanation:

Exponents of 2 in:

7-0

8-3

9-0

10-1

11-0

12-2

Hence maximum exponent if two is of 8.

*/

import java.util.Scanner;

public class MaxExponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(maxExponent(a, b));
        sc.close();
    }

    static int maxExponent(int a, int b) {
        int max = 0, num = 0;
        for(int i = a; i <= b; i++) {
            int temp = count(i);
            if(temp > max) {
                max = temp;
                num = i;
            }
        }
        return num;
    }

    private static int count(int i) {
        int count = 0;
        while(i % 2 == 0 && i != 0) {
            count++;
            i /= 2;
        }
        return count;
    }
}
