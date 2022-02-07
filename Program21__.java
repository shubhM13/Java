/*
1. You are given as input marks of a student.
2. Display an appropriate message based on the following rules:
  	  2.1 for marks above 90, print excellent.
  	  2.2 for marks above 80 and less than equal to 90, print good.
  	  2.3 for marks above 70 and less than equal to 80, print fair.
  	  2.4 for marks above 60 and less than equal to 70, print meets expectations.
  	  2.5 for marks less than equal to 60, print below par.

Example
----------
Input
> 92

Output
> excellent

--------------------------------
CONTINUOUS EXECUTION!
--------------------------------

Press 1 for Math
Press 2 for Science
Press 3 for Computers
Press 4 for English
Press 0 to Exit

>> 1
Enter your math score:
>> 100
Excellent!

Press 1 for Math
Press 2 for Science
Press 3 for Computers
Press 4 for English
Press 0 to Exit

>> 2
Enter your Science score:
>> 100
Excellent!

Press 1 for Math
Press 2 for Science
Press 3 for Computers
Press 4 for English
Press 0 to Exit

>> 0

int marks;
-----------------
|				|
|	5           |			
|---------------|			


Maths : Prime Numbers, GCD & LCM, Pythagorian Triplet (3^2 + 4^2 = 5^2)
*/

import java.util.Scanner;

public class Program21__ {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		double marks = 0;

		while (choice != 0) {
			System.out.println("Press 1 for Math");
			System.out.println("Press 2 for Science");
			System.out.println("Press 3 for Computers");
			System.out.println("Press 4 for English");
			System.out.println("Press 0 to Exit");

			choice = sc.nextInt();

			switch (choice) {
				case 1:
					System.out.println("Enter you Math score:");
					marks = sc.nextDouble();
					if (marks > 90) {
						System.out.println("Excellent");
					} else if (marks <= 90 && marks > 80) {
						System.out.println("Good");
					} else if (marks <= 80 && marks > 70) {
						System.out.println("Fair");
					} else if (marks <= 70 && marks > 60) {
						System.out.println("Meets Expectations");
					} else {
						System.out.println("Sub par");
					}
					break;
				case 2:
					System.out.println("Enter you Science score:");
					marks = sc.nextDouble();
					if (marks > 90) {
						System.out.println("Excellent");
					} else if (marks <= 90 && marks > 80) {
						System.out.println("Good");
					} else if (marks <= 80 && marks > 70) {
						System.out.println("Fair");
					} else if (marks <= 70 && marks > 60) {
						System.out.println("Meets Expectations");
					} else {
						System.out.println("Sub par");
					}
					break;
				case 3:
					System.out.println("Enter you English score:");
					marks = sc.nextDouble();
					if (marks > 90) {
						System.out.println("Excellent");
					} else if (marks <= 90 && marks > 80) {
						System.out.println("Good");
					} else if (marks <= 80 && marks > 70) {
						System.out.println("Fair");
					} else if (marks <= 70 && marks > 60) {
						System.out.println("Meets Expectations");
					} else {
						System.out.println("Sub par");
					}
					break;
				case 4:
					System.out.println("Enter you Computer score:");
					marks = sc.nextDouble();
					if (marks > 90) {
						System.out.println("Excellent");
					} else if (marks <= 90 && marks > 80) {
						System.out.println("Good");
					} else if (marks <= 80 && marks > 70) {
						System.out.println("Fair");
					} else if (marks <= 70 && marks > 60) {
						System.out.println("Meets Expectations");
					} else {
						System.out.println("Sub par");
					}
					break;
				case 0:
					System.out.println("Terminating the program ....");
					System.exit(0);
					// Exit Status 0 : OK
					// Exit Status != 0 or 1 : Something is wrong!
					break;
				default:
					System.out.println("Wrong Input!!");
			}

		}
		sc.close();

	}
}
