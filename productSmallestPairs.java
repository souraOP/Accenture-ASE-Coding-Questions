/*

Implement the following Function

def ProductSmallestPair(sum, arr)

The function accepts an integers sum and an integer array arr of size n. Implement the function to find the pair, 
(arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) 
and return the product of element of this pair

NOTE

    Return -1 if array is empty or if n<2
    Return 0, if no such pairs found
    All computed values lie within integer range

Example

Input: sum: 9

size of Arr = 7

Arr: 5 2 4 3 9 7 1

Output: 2

Explanation

Pair of least two element is (2, 1) 2 + 1 = 3 < 9, Product of (2, 1) 2*1 = 2. Thus, output is 2

Sample Input

sum:4, size of Arr = 6, Arr:9 8 3 -7 3 9

Sample Output

-21

 */

import java.util.Scanner;

public class productSmallestPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(solve(arr, n, sum));
        sc.close();
    }

    // intuition:

    /* 
    
    1. Sort the array in ascending order using Collection sort or using two pointers
    2. get the sum of first two elements from "sorted" array ie arr[0] + arr[1]
    3. check if the sum is less than given sum from the question
    4. if yes, return the product of first two elements since they will alwyas be the smallest pairs ie arr[0] * arr[1]
    5. if not, return 0 as per mentioned in the question

     */
    public static int solve(int[] arr, int n, int sum) {
        if(arr == null || n < 2) {
            return -1;
        }
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] > arr[j]) {
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
                }
            }
        }
        int check = arr[0] + arr[1];
        if(check <= sum){
            return arr[0] * arr[1];
        }
        return 0;
        
    }
 }
