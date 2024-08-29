/*
Instructions: You are required to write the code. You can click on compile and run anytime to check compilation/execution status. The code should be logically/syntactically correct.

Question: Write a program in C such that it takes a lower limit and upper limit as inputs and print all the intermediate palindrome numbers.

Test Cases:

TestCase 1:
Input :
10 , 80
Expected Result:
11 , 22 , 33 , 44 , 55 , 66 , 77.

Test Case 2:
Input:
100,200
Expected Result:
101 , 111 , 121 , 131 , 141 , 151 , 161 , 171 , 181 , 191

*/


#include <stdio.h>
#include <stdlib.h>

void find_palindrome(int ll, int ul);

int main() {
    int lower_limit, upper_limit;
    printf("Enter lower limit: ");
    scanf("%d", &lower_limit);
    printf("Enter the upper limit: ");
    scanf("%d", &upper_limit);
    find_palindrome(lower_limit, upper_limit);
    return 0;
}

void find_palindrome(int ll, int ul) {
    int reverse, n, last_digit;
    for(int i = ll; i <= ul; i++) {
        reverse = 0;
        n = i;
        while(n != 0) {
            last_digit = n % 10;
            reverse = reverse*10 + last_digit;
            n = n / 10;
        }
        if(i == reverse) {
            printf("%d ", i);
        }
    }
}
