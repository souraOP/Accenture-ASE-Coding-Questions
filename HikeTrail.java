/* 

Hike trail

You are on a hike trail represented by an array A of length N, where the Trail initially ascend and then descends forming a single peak. your task is to find and return an integer value representing the elevation of the summit

Input Specification:
input1: An integer array A
input2: An integer value N denoting the size of A

Output Specification:
Return an integer value representing the elevation of the summit

Example 1:
input1: [1, 2, 3, 4, 3, 2, 1]
input2: 7

Output: 4

*/

import java.util.*;

public class HikeTrail{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr, n));
        sc.close();
    }

    static int solve(int[] arr, int n){
        for(int i = 0; i < n; i++){
            
        }
    }
}
