
/*
1. You've to count the number of digits in a number.
2. Take as input "n", the number for which the digits has to be counted.
3. Print the digits in that number.

Sample Input
65784383

Sample Output
8
*/
import java.util.Scanner;

public class Program29 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int digits = 0;
        while (n != 0) {
            n = n / 10;
            digits++;
        }
        System.out.println(digits);
        sc.close();
    }
}
