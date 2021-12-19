
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
                System.out.println("Enter the length of cuboid:");
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
                System.out.println("Enter the radius of cylinder:");
                double rCyliner = sc.nextDouble();
                System.out.println("Enter the height of cylinder:");
                double hCylinder = sc.nextDouble();
                double vCylinder = (22.0 / 7.0) * rCyliner * rCyliner * hCylinder; // mathematical operators
                // 3.1428571429 * 10 * 10 * 7 = 2200
                // 3 * 10 * 10 * 7 = 2100
                // Note : The result of integer division is always truncated and rounded off to
                // the just smaller integer value Ex. 3.1428 ---> 3; 2.5 ---> 2;
                System.out.println("The Volumne of Cylinder with radius " + rCyliner +
                        " and height " + hCylinder + " is " + vCylinder + " cu units.");
                break;

            // Cone
            case 3:
                System.out.println("Enter the radius of cone:");
                double rCone = sc.nextDouble();
                System.out.println("Enter the height of cone:");
                double hCone = sc.nextDouble();
                double vCone = (1.0 / 3.0) * (22.0 / 7.0) * rCone * rCone * hCone; // mathematical operators
                System.out.println("The Volumne of Cone with radius " + rCone +
                        " and height " + hCone + " is " + vCone + " cu units.");
                break;

            default:
                System.out.println("Wrong choice selected! Please select from 1, 2 or 3.");
        }
        sc.close();

    }
}
