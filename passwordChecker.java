/*

You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is 
valid password else 0.
str is a valid password if it satisfies the below conditions.

    – At least 4 characters
    – At least one numeric digit
    – At Least one Capital Letter
    – Must not have space or slash (/)
    – Starting character must not be a number

Assumption:
Input string will not be empty.

Example:

Input 1: aA1_67
Input 2: a987 abC012

Output 1: 1
Output 2: 0

 */
import java.util.Scanner;

public class passwordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solve(str, str.length()));
        sc.close();
    }

    public static int solve(String str, int n) {
        // atleast 4 characters
        if(n < 4) return 0;
        // starting character should not be a number
        if(str.charAt(0) >= '0' && str.charAt(0) == '9') {
            return 0;
        }
        int num = 0, c = 0;
        for(int i = 0; i < n; i++) {
            // should not contain any space or backslash
            if(str.charAt(i) == ' ' || str.charAt(i) == '/') {
                return 0;
            }
            // checking for numeric digits
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num++;
            }
            //checking for capital letters
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                c++;
            }
        }
        if(num > 0 && c > 0) {
            return 1;
        }
        return 0;
    }
}
