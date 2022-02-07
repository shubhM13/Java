
/*
WAP to read the maximum value of X and Y coordinate and print all the points in that region

Sample Input
-------------

>> Enter the maximum X coord:
5
>> Enter the maximum Y coord:
4

Pattern 1:
----------
>> (1,1) (1,2) (1,3) (1,4)
>> (2,1) (2,2) (2,3  (2,4)
....
....
>> (5,1) (5,2) (5,3) 5,4)

Pattern 2: 
----------
>>(5,1) (5,2) (5,3) 5,4).
....
>> (2,1) (2,2) (2,3  (2,4)
>> (1,1) (1,2) (1,3) (1,4)

Pattern 3:
----------
(1,4) (2,4) (3,4) (4,4) (5,4)
(1,3) (2,3) (3,3) (4,3) (5,3)
..
..
..
(1,1) (2,1) (3,1) (4,1) (5,1)
*/

import java.util.Scanner;

public class Program23 {
    public static void main(String args[]) {
        int xMax = 0, yMax = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the maximum X coord:");
        xMax = sc.nextInt();
        System.out.println("Enter the maximum Y coord:");
        yMax = sc.nextInt();

        System.out.println("Pattern 1");
        for (int x = 1; x <= xMax; x++) {
            for (int y = 1; y <= yMax; y++) {
                System.out.print("(" + x + ", " + y + ") ");
            }
            System.out.println("");
        }

        System.out.println("Pattern 2");
        // Write for loop here

        System.out.println("Pattern 3");
        // Write for loop here
        sc.close();
    }
}

// HW
// 1) P2
// 2) P3
// 3) SP 1