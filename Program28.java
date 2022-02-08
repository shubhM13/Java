
/*
1. You've to print first n fibonacci numbers.
2. Take as input "n", the count of fibonacci numbers to print.
3. Print first n fibonacci numbers.

Sample Input
10

Sample Output
0
1
1
2
3
5
8
13
21
34
*/
import java.util.Scanner;

public class Program28 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);

        for (int i = 3; i <= n; i++) {
            int third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        }
        sc.close();
    }
}
