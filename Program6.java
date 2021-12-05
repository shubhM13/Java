
/*
day : day of the week
day = 1: Monday
day = 2: Tuesday
day = 3: Wednesday
day = 4: Thursday
day = 5: Friday
day = 6: Saturday
day = 7: Sunday

*/


import java.util.Scanner;

public class Program6 {
    public static void main(String args[]) {
        // Initialize Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of the week in numerical form:");
        int day = sc.nextInt();
        // Scanners should be closed when we are done reading
        sc.close();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Day");
                break;
        }
    }
}
