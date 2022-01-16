// Increment and Decrement Operators in Java
// Increment : Pre & Post
// Decrement : Pre & Post

public class Program19 {
    public static void main(String args[]) {

        // POST INCREMENT
        System.out.println("---------------POST INCREMENT---------------");
        int x = 10;
        int y = x++; // When compiler sees the post increment, it will change the value only in the
                     // next line and not in the same line
        int z = 100;
        System.out.println("x value is " + x);
        System.out.println("y old value is " + y);
        System.out.println("z old value is " + z++);
        System.out.println("z new value is " + z);

        // PRE INCREMENT
        System.out.println("---------------PRE INCREMENT---------------");
        int a = 10;
        int b = ++a; // When compiler sees the pre increment, it will change the value of 'a'
                     // immediately before assigning to 'b'
        System.out.println("a value is " + a);
        System.out.println("b value is " + b);

        // POST DECREMENT
        System.out.println("---------------POST DECREMENT---------------");
        int p = 10;
        int q = p--; // When compiler sees the post decrement operator, it will NOT change the value
                     // of 'p' immediately
                     // rather the value would be decreased only from the next line onwards
        System.out.println("p value is " + p);
        System.out.println("q value is " + q);

        // POST DECREMENT
        System.out.println("---------------PRE DECREMENT---------------");
        int m = 10;
        int n = --m; // When compiler sees the pre decrement operator, it will change the value of
                     // 'm' immediately before assigning to 'n'
        System.out.println("m value is " + m);
        System.out.println("n value is " + n);

    }
}
