/*
24 Hr Clock Timing

Before 12:00 : Good Morning
Between 12:00 to 17:00 (5 PM in evening) : Good Day
After 17:00 : Good Evening
*/


public class Program5 {

    public static void main(String args[]) {

        int time = 22;

        if (time > 20) {
            System.out.println("Program will exit after this statement");
            System.out.println("Athul");
            System.exit(0);
            System.out.println("Shubham");
        } else {
            System.out.println("Program did not Exit");
        }
    }
}
