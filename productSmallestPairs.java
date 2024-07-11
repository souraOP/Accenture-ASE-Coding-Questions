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

import java.util.*;

public class productSmallestPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(sum, n, arr));
        sc.close();
    }

    public static int solve(int sum, int n, int[] arr) {
        int temp, check;
        if(n < 2) {
            return -1;
        }
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        check = arr[0] + arr[1];
        if (check <= sum) {
            return arr[0] * arr[1];
        }
        return 0;
    }
}
