/*
Ques: Take 3 positive integers input and
tell if they can be the sides of a triangle
or not.

-> Sum of any two sides of the triangle should be greater than the 3rd one.
*/

import java.util.Scanner;

class program6 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side: ");
        a = sc.nextInt();
        System.out.print("Enter 2nd side: ");
        b = sc.nextInt();
        System.out.print("Enter 3rd side: ");
        c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Triangle is valid.");
        } else {
            System.out.println("Triangle is not valid.");
        }

        sc.close();
    }
}