/*
Problem Statement

You are given a function,

Void *ReplaceCharacter(Char str[], int n, char ch1, char ch2);

The function accepts a string ‘str’ of length n and two characters ‘ch1’ and ‘ch2’ as its 
arguments. Implement the function to modify and return the string 'str' in such a way that all 
occurrences of ‘ch1’ in original string are replaced by ‘ch2’ and all occurrences of ‘ch2’  in 
original string are replaced by ‘ch1’.

Assumption: String Contains only lower-case alphabetical letters.

Note:

Return null if string is null.
If both characters are not present in string or both of them are same , then return the string 
unchanged.

Example:

Input:

Str: apples
ch1: a
ch2: p

Output:

paales

Explanation:

‘A’ in original string is replaced with ‘p’ and ‘p’ in original string is replaced with ‘a’, 
thus output is paales.
 
*/

import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        replaceChar(str, c1, c2);
        sc.close();
    }

    private static void replaceChar(String str, char c1, char c2) {
        String res = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c1) {
                res = res + c2;
            } else if (str.charAt(i) == c2) {
                res += c1;
            }
            else {
                res = res + str.charAt(i);
            }
        }
        System.out.println(res);
    }
}
