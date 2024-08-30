/*
Mango Distribution

Given a number of mangoes and number of persons. Find the number of ways to distribute identical mangoes among identical persons.

Input Specification:

input1: the number of mangoes
input2: the number of persons

 Specification:

Return the number of ways to distribute identical mangoes among identical persons.


Example 1:

input1: 2
input2: 2

Output: 3


Example 2:

input1: 1
input2: 12

output: 1
*/

import java.util.Scanner;

public class MangoDistribution {
    static int getDistribution(int input1, int input2) {
        if(input1 < input2) {
            return 0;
        }
        int res = 1;
        input1 = input1 + input2 - 1;
        input2 = input1 - 1;
        if(input2 > input1 - input2) {
            input2 = input1 - input2;
        }
        for (int i = 0; i < input2; i++) {
            res = res * (input1 - i);
            res = res / (i + 1);
        }
        return res;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mangoes = sc.nextInt();
        int persons = sc.nextInt();
        System.out.println(getDistribution(mangoes, persons));
        sc.close();
    }
}
