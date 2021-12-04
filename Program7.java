package Java;
// Java Switch Case Fall Through Example

public class Program7 {
    public static void main(String args[]) {
        int ch = 2;
        switch (ch) {
            case 1:
                System.out.println("Desktop");
                break;
            case 2:
                System.out.println("Laptop");
                break;
            case 3:
                System.out.println("Laptop better than Desktop");
                break;
        }
    }
}
