/* 

You are given a function,
int findCount(int arr[], int length, int num, int diff);

The function accepts an integer array ‘arr’, its length and two integer variables ‘num’ and ‘diff’. Implement this 
function to find and return the number of elements of ‘arr’ having an absolute difference of less 
than or equal to ‘diff’ with ‘num’.
Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ is less than or equal to ‘diff’, return -1.

Example:
Input:

    arr: 12 3 14 56 77 13
    num: 13
    diff: 2

Output: 3

Explanation:
Elements of ‘arr’ having absolute difference of less than or equal to ‘diff’ i.e. 2 with ‘num’ i.e. 13 are 12, 13 and 14.

 */

import java.util.*;

public class findTheCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        System.out.print("Enter diff: ");
        int diff = sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr, n, num, diff));
        sc.close();
    }

    public static int solve(int[] arr, int length, int num, int diff) {
        int c = 0;
        for(int i = 0; i < length; i++) {
            if(Math.abs(num - arr[i]) <= diff) {
                c++;
            }
        }
        if(c > 0) {
            return c;
        }
        return -1;
    }
}
