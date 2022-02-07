/*
Write a program to accept any 10 numbers and display only those numbers which are prime.
Hint: A number is said to be prime if it is only divisible by 1 and the number itself.
*/
import java.util.Scanner;
public class Program26 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        // read 10 numbers
        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();
            // Function Call
            if (isPrimeNum(n)) {
                System.out.println(n + " is a Prime number");
            }
        }
        sc.close();
    }
    // This is a user defined function which returns true: if the number n passed to
    // it is Prime otherwise it returns false
    // 1) A UDF should have 'public static' to be called from main method
    // 2) You need to always determine the return type of the function : VOID, INT,
    // BOOLEAN, FLOAT, STRING, DOUBLE
    // 3) If the return type is not VOID, then we need to have a return statement at
    // the end of the function
    // Function Definition
    public static boolean isPrimeNum(int num) {
        // Algorithm
        boolean isPrime = true;
        if (num == 1) {
            isPrime = false;
        }
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}

/* HW
1) Program 30 : 3 times (1 referring , 2 w/o referring repeated programs)
2)