
/*
Volume of a cuboid (v = l*b*h)
Volume of a cylinder (v = π*r2*h)
Volume of a cone (v = (1/3)*π*r2*h)
--------------------------------------
Terminal:

1. Cuboid
2. Cylinder
3. Cone
Enter the choice of solid for which you want calculate the Volume:
>> 2
Enter the radius of Cylinder: 
>> 7
Enter the height of Cyliner
>> 1
The Volumne of Cylinder with height 1 and radius 7 is 154 cu units


rCylinder, hCylinder
rCone, hCone
*/
import java.util.Scanner;

public class Program14 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Cuboid");
        System.out.println("2. Cylinder");
        System.out.println("3. Cone");
        System.out.println("Enter the choice of solid for which you want calculate the Volume:");
        int choice = sc.nextInt();

        switch (choice) {
            // Cuboid
            case 1:
                System.out.println("Enter the lenght of cuboid:");
                double l = sc.nextDouble();
                System.out.println("Enter the breadth of cuboid:");
                double b = sc.nextDouble();
                System.out.println("Enter the height of cuboid:");
                double h = sc.nextDouble();
                double v = l * b * h; // mathematical operators
                System.out.println("The Volumne of Cuboid with length " + l +
                        ", breadth " + b + " and height " + h + " is " + v + " cu units.");
                break;

            // Cylinder
            case 2:
                break;

            // Cone
            case 3:
                break;

            default:
                System.out.println("Wrong choice selected! Please select from 1, 2 or 3.");
        }

    }
}
