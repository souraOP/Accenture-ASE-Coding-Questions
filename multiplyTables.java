/*

Instructions: You are required to write the code. You can click on compile and run anytime to check compilation/execution status. 
The code should be logically/syntactically correct.

Problem: Write a program in C to display the table of a number and print the sum of all the multiples in it.

Test Cases:

Test Case 1:
Input:
5
Expected Result Value:
5, 10, 15, 20, 25, 30, 35, 40, 45, 50
275

Test Case 2:
Input:
12
Expected Result Value:
12, 24, 36, 48, 60, 72, 84, 96, 108, 120
660

 */

import java.util.Scanner;

public class multiplyTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        getTheTables(number);
        sc.close();
    }

    static void getTheTables(int number){
        int multiplyNumber, sumTheNumber = 0;
        for(int i = 1; i <= 10; i++) {
            multiplyNumber = number * i;
            System.out.print(multiplyNumber + " ");
            sumTheNumber += multiplyNumber;
        }
        System.out.println();
        System.out.println(sumTheNumber);
    }
}
