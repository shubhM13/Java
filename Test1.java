/*
 * 
 * 1) WAP to print first 10 even numbers using for loop
 * expected o/p:
 * 2
 * 4
 * 6
 * 8
 * 10
 * 12
 * 14
 * 16
 * 18
 * 20
 * 
 * 2) WAP to print first 10 odd numbers using for loop
 * exp o/p:
 * 1
 * 3
 * 5
 * 7
 * 9
 * 11
 * 13
 * 15
 * 17
 * 19
 * 21
 * 
 * 3) WAP to read a number from the user and print the corresponding month
 * ex: 1 -> January
 * 2 -> Febuary
 * 3 -> March
 * .
 * .
 * .
 * 
 */

public class Test1 {
    public static void main(String args[]) {

        // Method 1
        System.out.println("Method 1: 2*i");

        for (int i = 1; i <= 10; ++i) {
            System.out.println(2 * i);
        }

        // Method 2
        System.out.println("Method 2: a%2 == 0");
        int count = 0;
        int num = 1;

        while (count < 10) {
            if (num % 2 == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}