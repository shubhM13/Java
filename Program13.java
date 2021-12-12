// Ternary Operator to If Else - Exam Problem
// Sales and Commisions

import java.util.Scanner;

public class Program13 {
    public static void main(String args[]) {
        int sales, comm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of sales:");
        sales = sc.nextInt();
        sc.close();

        comm = (sales > 15000) ? sales * 5 / 100 : 0;
        System.out.println("The commision for sales value " + sales + " is " + comm + ".");
    }
}
