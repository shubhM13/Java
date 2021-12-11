// Illustration of Ternary Operator 2 : USING ?: 
// Q) Find the difference between 2 numbers :
// a) 13, 8 = 5
// b) 100, 75 = 25
// c) 12, 20 = 8
// d) 80, 200 = 120
// e) 100, 100 = 0

import java.util.Scanner;

public class Program10 {
    public static void main(String args[]) {
        int num1, num2; // Varialbe Decalration
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        num1 = sc.nextInt(); // Varailble Assignement
        System.out.println("Enter num2:");
        num2 = sc.nextInt();
        sc.close();

        int result = (num1 > num2) ? (num1 - num2) : (num2 - num1); // TERNARY OPERATOR : result = a ? b : c;
        System.out.println("The difference is: " + result);
    }
}

// int a = 0; : Variable Declaration + Assignment