/*
You are given an integer array of N integers. Your task is to find and return an integer value representing the count of 
elements in the array where the count of set bits is equal to a given number X.

Note: A set bit refers to the value 1 of any bit for a number in its binary representation

Input Specification:

Input 1: An integer array of N elements.
Input 2: An integer value N. representing the length of the array. 
Input3: An integer value X. representing the target count of set bits.

Output Specification:
Return an integer value representing the count of elements in the array where the count of set bits is equal to a given number X.

Example 1:
input1 : [2, 3, 4, 5, 7, 12]
input2 : 6
input3: 2

*/

import java.util.Scanner;

public class setBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of elements: ");
        int input2 = sc.nextInt();
        int[] input1 = new int[input2];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < input2; i++){
            input1[i] = sc.nextInt();
        }
        System.out.print("Enter the set bits it should have: ");
        int input3 = sc.nextInt();
        int count = getSetBits(input1, input2, input3);
        System.out.println("Number of elements with " + input3 + " set bits: " + count);
        sc.close();
    }

    public static int getSetBits(int[] input1, int input2, int input3) {
        int res = 0;
        for(int i = 0; i < input2; i++) {
            if(countSetBits(input1[1]) == input3){
                res++;
            }
        }
        return res;
    }

    private static int countSetBits(int num) {
        int count = 0;
        while(num > 0) {
            count += num & 1;
            num = num >> 1;
        }
        return count;
    }
}
