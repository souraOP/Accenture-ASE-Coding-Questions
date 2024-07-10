/* 

Problem Description :
The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its 
argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and 
each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

Note:

    Return -1 if the array is null
    Return 0 if the total amount of food from all houses is not sufficient for all the rats.
    Computed values lie within the integer range.
    
    Example:
    
    Input:
        r: 7
        unit: 2
        n: 8
        arr: 2 8 3 5 7 4 1 2
    
    Output: 4
    
    Explanation:
    Total amount of food required for all rats = r * unit
    
    = 7 * 2 = 14.
    
    The amount of food in 1st houses = 2+8+3+5 = 18. Since, amount of food in 1st 4 houses is sufficient for all 
    the rats. Thus, output is 4.


*/

import java.util.*;
class ratCountHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr, r, unit, n));
        sc.close();
    }
    
    public static int solve(int[] arr, int r, int unit, int n) {
        int sum = 0;
        if(arr == null) {
            return -1;
        }
        int count = 0;
        int ans = r * unit;
        for(int i =0; i < n; i++) {
            sum += arr[i];  // getting the sums of all the houses
            count++;
            if(sum >= ans) {
                break;
            }
        }
        if (sum < ans) {
            return 0;
        }
        
        return count;
    }
}