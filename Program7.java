// Java Switch Case Fall Through Example

public class Program7 {
    public static void main(String args[]) {
        int ch = 2;
        switch (ch) {
            case 1:
                System.out.println("Desktop");
                break;
            // Fall through happens when the break; is not specified after a case, In this
            // situation the following case statements would execute without a check.
            case 2:
                System.out.println("Laptop");
            case 3:
                System.out.println("Laptop better than Desktop");
            case 4:
                System.out.println("Tablet");
                break;
            case 5:
                System.out.println("Tablet is the smallest among all the three");
                break;
            default:
                System.out.println("This is the default case");
                break;
        }
    }
}
