// Ternary Operator - Exam Problem 1 (using if else)
// Even and Odd

import java.util.Scanner;

public class Program11 {
    public static void main(String args[]) {
        int num; // Variable Declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        num = sc.nextInt(); // Variable Assignment
        sc.close();

        if (num % 2 == 0) {
            System.out.println(num + " is Even number.");
        } else {
            System.out.println(num + " is Odd number.");
        }
    }
}
