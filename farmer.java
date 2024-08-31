/*
There are n farmers in an area. Each farmer owns 'X' number of
land. Find the sum of lands owned by all the farmer's(1 based
indexing). The number of land 'X' is the xor operation of the
land owner by his previous farmer and his number.
Input Format:
One line consist of 'N' which represents the number of farmer in
the given area.
Output Format:
Print total number of lands owned by n farmer.
Testcase:
i) n=1
Output -> 1
ii) n=3
Output -> 4

*/

import java.util.*;

public class farmer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(totalLand(N));
        sc.close();
    }

    static int totalLand(int N) {
        int[] farmers = new int[N + 1];
        for(int i=1;i<=N;i++){
            farmers[i] = farmers[i - 1] ^ i;
        }
        int totalLand = 0;
        for(int land: farmers) {
            totalLand += land;
        }
        return totalLand;
    }
}