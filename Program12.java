// Ternary Operator - Exam Problem 1 (using ternary operator)
// Even and Odd

import java.util.Scanner;

public class Program12 {
    public static void main(String args[]) {
        int num; // Variable Declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt(); // Variable Assignment
        sc.close();

        String result = (num % 2 == 0) ? num + " is an Even Number." : num + " is an Odd Number."; // Varaible
                                                                                                   // Declaration +
                                                                                                   // Assignment
        System.out.println(result);
    }
}
