/*
Instructions: You are required to write the code. You can click on compile & run anytime to check the compilation/ execution status of the program. 
The submitted code should be logically/syntactically correct and pass all the test cases.

Ques: The program is supposed to calculate the sum of  distance between three points from each other.

For
x1 = 1 y1 = 1
x2 = 2 y2 = 4
x3 = 3 y3 = 6

Distance is calculated as : sqrt((x2-x1)^2 + (y2-y1)^2)

*/

import java.util.Scanner;

public class SumOfDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x1 = sc.nextFloat(), y1 = sc.nextFloat(), x2 = sc.nextFloat(), y2 = sc.nextFloat(), x3 = sc.nextFloat(), y3 = sc.nextFloat();
        float diff_1 = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        float diff_2 = (float) Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        float diff_3 = (float) Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        System.out.println(diff_1 + diff_2 + diff_3);
        sc.close();
    }    
}
