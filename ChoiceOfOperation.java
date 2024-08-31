/*
Problem Statement

You are required to implement the following function.

Int OperationChoices(int c, int n, int a , int b)

The function accepts 3 positive integers ‘a’ , ‘b’ and ‘c‘ as its arguments. Implement the 
function to return.

( a + b ) , if c=1
( a – b ) , if c=2
( a * b ) , if c=3
( a / b ) , if c=4

Assumption : All operations will result in integer output.

Example:

Input
c: 1
a: 12
b: 16

Output: 28

Since ‘c’=1 , (12+16) is performed which is equal to 28 , hence 28 is returned.

Sample Input
 c : 2
 a : 16
 b : 20

Sample Output: -4

*/

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidChoiceException extends Exception {
    protected InvalidChoiceException(String message) {
        super(message);
    }
}

public class ChoiceOfOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        while(true) {
            try {
                System.out.println("Enter c value: ");
                c = sc.nextInt();
                if(c == 1 || c == 2 || c == 3 || c == 4) {
                    break;
                } else {
                    throw new InvalidChoiceException("Invalid input! Please enter 1, 2, 3 or 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid input..");
                sc.next();
            } catch (InvalidChoiceException e) {
                System.out.println(e.getMessage());
            }
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(operationChoice(c, a, b));
        sc.close();
    }

    static int operationChoice(int c, int a, int b) {
        int answer = 0;
        switch(c) {
            case 1:
                answer = a + b;
                break;
            case 2:
                answer = a - b;
                break;
            case 3:
                answer = a * b;
                break;
            case 4:
                answer = a / b;
                break;
        }
        return answer;
    }
}
