/*
Coding Question 6
A carry is a digit that is transferred to left if sum of digits exceeds 9 while adding two numbers from 
right-to-left one digit at a time

You are required to implement the following function, Int NumberOfCarries(int num1 , int num2);

The functions accepts two numbers ‘num1’ and ‘num2’ as its arguments. You are required to calculate and return 
the total number of carries generated while adding digits of two numbers ‘num1’ and ‘ num2’.

Assumption: num1, num2>=0

Example:

Input

Num 1: 451
Num 2: 349

Output: 2

Explanation:

Adding ‘num 1’ and ‘num 2’ right-to-left results in 2 carries since ( 1+9) is 10. 1 is carried and (5+4=1) is 10,
again 1 is carried. Hence 2 is returned.

Sample Input

Num 1: 23

Num 2: 563

Sample Output: 0

*/

import java.util.Scanner;

public class NumberOfCarries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(numOfCarries(num1, num2));
        sc.close();
    }

    static int numOfCarries(int num1, int num2) {
        int carry = 0;
        int temp1 = num1, temp2 = num2;
        int rem = 0;
        while(temp1 != 0 && temp2 != 0){
            // get the last digit
            int d1 = temp1 % 10, d2 = temp2 % 10;
            if((d1 + d2 + rem) > 9){
                carry++;
                int sum = d1 + d2 + rem;
                sum = sum /10;
                rem = sum;
            }
            temp1 = temp1 / 10;
            temp2 = temp2 / 10;
        }
        return carry;
    }
}
