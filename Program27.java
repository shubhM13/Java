
/*
In an entrance examination, students have answered English, Maths and Science papers.
Write a program to calculate and display average marks obtained by all the students.
Take number of students appeared and marks obtained in all three subjects by every student along with the name as inputs.
Sample Input & Output:
----------------------
Enter the number of students:
>> 2
Enter the details of student 1:
Name:
>> Athul
English Marks: 
>> 96
Science Marks: 
>> 88
Math Marks: 
>> 84
Average marks of Athul: 
>> 89.333333
Enter the details of student 2:
Name:
>> Shubham
English Marks: 
>> 75
Science Marks: 
>> 90
Math Marks: 
>> 95
Average marks of Shubham: 
>> 86.666667
Class Avergae
>> 88.0
*/
import java.util.Scanner;
public class Program27 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        double students = sc.nextDouble();
        double ttlMarks = 0.0;

        for (int i = 1; i <= students; i++) {
            System.out.println("Enter details of student " + i);
            System.out.println("Enter name:");
            String name = sc.next();
            System.out.println("Enter English marks:");
            double engMarks = sc.nextDouble();
            System.out.println("Enter Science marks:");
            double sciMarks = sc.nextDouble();
            System.out.println("Enter Math marks:");
            double mathMarks = sc.nextDouble();

            double average = (engMarks + sciMarks + mathMarks) / 3.0;
            System.out.println(name + "'s" + " Average Marks: " + average);
            ttlMarks += average;
        }
        double classAvg = ttlMarks / students;
        System.out.println("Class Average: " + classAvg);
        sc.close();
    }
}