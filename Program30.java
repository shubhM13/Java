
/*
1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.

Sample Input
------------
65784383
Sample Output
-------------
3
8
3
4
8
7
5
6
*/
import java.util.Scanner;

public class Program30 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        while (n != 0) {
            System.out.println(n % 10);
            n /= 10;
            // n = n/10 : Shorthand Assignment Notation
            // n = n + 10 --> n += 10
            // n = n - 10 --> n -= 10
            // n = n * 10 --> n *= 10
        }
        sc.close();
    }
}
