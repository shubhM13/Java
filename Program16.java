/*
Write a program to accept marks in Physics, Chemistry and Biology. The program calculates the average and displays the stream accordingly:

Average Marks                     |      Grade
--------------------------------------------------
80% and above                          Distinction
60% or more but less than 80%          First Division
45% or more but less than 60%          Second Division
40% or more but less than 45%          Pass
<40%                                   Promotion Not Granted
*/

import java.util.Scanner;

public class Program16 {
    public static void main(String args[]) {
        // Varaible Declaration
        String name, grade;
        double marksPhy, marksChem, marksBio, avgMarks;
        Scanner sc = new Scanner(System.in);

        // Reading inputs and Variable assignment
        System.out.println("Enter the student's name:");
        name = sc.next();
        System.out.println("Enter Physics Marks:");
        marksPhy = sc.nextDouble();
        System.out.println("Enter Chemistry Marks:");
        marksChem = sc.nextDouble();
        System.out.println("Enter Biology Marks:");
        marksBio = sc.nextDouble();
        sc.close();

        // Calulating Average : Average of n numbers = Sum of n numbers / n | ex.
        // AVG(10, 20, 30, 40 , 50) = (10+20+30+40+50)/5 = 150/5 = 30
        avgMarks = (marksPhy + marksChem + marksBio) / 3.0;

        if (avgMarks >= 80) {
            grade = "Distinction";
        } else if (avgMarks >= 60 && avgMarks < 80) {
            grade = "First Division";
        } else if (avgMarks >= 45 && avgMarks < 60) {
            grade = "Second Division";
        } else if (avgMarks >= 40 && avgMarks < 45) {
            grade = "Pass";
        } else {
            grade = "Promotion Not Granted";
        }

        System.out.println("Name:" + name);
        System.out.println("Average marks:" + avgMarks);
        System.out.println("Grade:" + grade);
    }
}
