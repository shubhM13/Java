/*
Reverse the number
Input
-----
1234

Output
------
4321
*/

import java.util.Scanner;

public class Program31 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int rev = 0;
        while (n != 0) {
            int extract = n % 10;
            rev = rev * 10 + extract;
            n /= 10;
        }
        System.out.println(rev);
        sc.close();
    }
}

/*
 * 1) Revise & write the last 3 while loop programs
 * 2) Write a menu driven program to display all prime and non-prime numbers
 * from 1 to 100.
 * Enter 1: to display all prime numbers
 * Enter 2: to display all non-prime numbers
 * 3) Greatest among 2 numbers using if-else and ternary operators
 * 4) Greatest among 3 numbers using if-else and ternary operators
 */