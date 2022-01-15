// WAP to read 5 no.s from user and print it.

import java.util.Scanner;

public class Program18 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num, sum = 0, count;

        System.out.println("How many numbers do u want to add ?");
        count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("Enter number " + i);
            num = sc.nextInt();
            sum = sum + num;
        }

        System.out.println("The sum of " + count + " numbers is " + sum);
        sc.close();
    }
}
