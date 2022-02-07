/*

Write a program to display the Mathematical Table from 5 to 10 for 10 iterations in the given format:
Sample Output: Table of 5
5*1 = 5
5*2 =10
--------
--------
5*10 = 50
*/

public class Program25 {
    public static void main(String args[]) {

        for (int i = 5; i <= 10; i++) {
            System.out.println("Table of " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
            System.out.println("");
        }
    }
}
