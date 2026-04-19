/*
Ques: Take 3 positive integers input and
print the greatest of them.
*/

import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        c = sc.nextInt();

        if (a >= b && a >= c)
            System.out.println(a + " is the greatest number.");
        else if (b >= a && b >= c)
            System.out.println(b + " is the greatest number.");
        else if (c >= a && c >= b)
            System.out.println(c + " is the greatest number.");

        int greatest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(greatest);

        sc.close();
    }
}