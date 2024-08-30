/*
Problem Statement

You are required to implement the following function:

Int Calculate(int m, int n);

The function accepts 2 positive integer ‘m’ and ‘n’ as its arguments.You are required to calculate the sum of numbers divisible both by 3 and 5, between ‘m’ and ‘n’ both inclusive and return the same.
Note
0 < m <= n

Example

Input:

m : 12

n : 50

Output

90

Explanation:
The numbers divisible by both 3 and 5, between 12 and 50 both inclusive are {15, 30, 45} and their sum is 90.
Sample Input
m : 100
n : 160
Sample Output
510

 */

import java.util.Scanner;

public class sumDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int getSum = calculateDivisibility(m, n);
        System.out.println(getSum);
        sc.close();
    }

    static int calculateDivisibility(int m, int n) {
        int sum = 0;
        for(int i = m; i <= n; i++) {
            // if divisible by 3
            if(i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
