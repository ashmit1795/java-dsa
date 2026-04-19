/*
Ques: Take positive integer input and
tell if it is a four digit number or not.
*/

import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        x = sc.nextInt();

        if (x > 999 && x < 10000) {
            System.out.println(x + " is a four digit integer");
        } else {
            System.out.println(x + " is not a four digit integer");
        }


        sc.close();
    }
}