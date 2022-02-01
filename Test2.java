/*
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
*/

public class Test2 {
    public static void main(String args[]) {

        // Method 1
        System.out.println("Method 1: 2*i - 1");

        for (int i = 1; i <= 10; ++i) {
            System.out.println(2 * i - 1);
        }

        // Method 2
        System.out.println("Method 2: a%2 == 1");
        int count = 0;
        int num = 1;

        while (count < 10) {
            if (num % 2 == 1) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
