/*
Print : X is greater than Y  (if that is the case)
*/
package Java;

public class Program4 {
    // attributes
    // --

    // functions
    public static void main(String args[]) {
        int x = 20;
        int y = 20;

        if (x > y) {
            System.out.println("X is greater than Y");
        } else if (x == y) {
            System.out.println("X is equal to Y");
        } else {
            System.out.println("Y is greater than X");
        }

    }
}
