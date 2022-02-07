/*
>> Enter the number:
5
>> Prime

>> Enter the number:
15
>> Composite

1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "composite" otherwise.

Input
A number t
A number n
A number n
.. t number of times

Output
prime
not prime
not prime
.. t number of times

Sample Input

5
13
2
3
4
5

Sample Output
prime
prime
prime
not prime
prime
*/

import java.util.Scanner;

public class Program22_ {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count");
        int count = sc.nextInt();
        int j = 1;
        while (j <= count) {
            System.out.println(j + "." + " Enter a natural number");
            int num = sc.nextInt();
            boolean isPrime = true;

            // ----------- ALGORTIHM: CHECK PRIME NUMBER -------------
            for (int i = 2; i <= num - 1; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Composite Number");
            }
            // ----------------------------------------------------------

            j++;
            System.out.println("");
        }

        sc.close();
    }
}
