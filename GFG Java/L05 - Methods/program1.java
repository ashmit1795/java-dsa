
/*
    Built-in methods
*/

import java.util.Scanner;

class program1 {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(10)); // Square root
        System.out.println(Math.cbrt(1000)); // Cube root
        System.out.println(Math.PI); // Pi
        System.out.println(Math.E); // Euler's number
        System.out.println(Math.pow(2, 3)); // Power
        System.out.println(Math.max(10, 20)); // Max
        System.out.println(Math.min(10, 20)); // Min
        System.out.println(Math.abs(-10)); // Absolute value
        System.out.println(Math.round(10.5)); // Round
        System.out.println(Math.ceil(10.1)); // Ceiling - Smallest integer greater than or equal to the given number, e.g., ceil(10.1) = 11, ceil(-10.9) = -10
        System.out.println(Math.floor(10.9)); // Floor - Greatest integer less than or equal to the given number, e.g., floor(10.9) = 10, floor(-10.1) = -11

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();
        System.out.print("Enter 4th number: ");
        int d = sc.nextInt();
        

        int max = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println("Maximum number = " + max);

        sc.close();
    }
}
