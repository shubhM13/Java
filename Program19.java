// Increment and Decrement Operators in Java
// Increment : Pre & Post
// Decrement : Pre & Post

public class Program19 {
    public static void main(String args[]) {
        int x = 10;
        int y = x++; // When compiler sees the post increment, it will change the value only in the
                     // next line and not
        int z = 100;
        System.out.println("x value is " + x);
        System.out.println("y value is " + y);
        System.out.println("z old value is " + z++);
        System.out.println("z new value is " + z);
    }
}
