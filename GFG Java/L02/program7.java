/*
HW: Given a point (x, y), write a program
to find out if it lies in the 1st Quadrant,
2nd Quadrant, 3rd Quadrant, 4th
Quadrant, on the x-axis, y-axis or at the
origin.
*/

import java.util.Scanner;

class program7 {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        x = sc.nextInt();
        System.out.print("Enter y: ");
        y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (y == 0) {
            System.out.println("x-axis");
        } else if (x == 0 ) {
            System.out.println("y-axis");
        } else if (x > 0 && y > 0) {
            System.out.println("1st Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("2nd Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("3rd Quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("4th Quadrant");
        }

        sc.close();
    }
}