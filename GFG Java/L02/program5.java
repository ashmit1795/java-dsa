/*
HW: Take integer input and tell if its
magnitude is smaller than 69 or not.
*/

import java.util.Scanner;

public class program5 {

    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        x = sc.nextInt();

        if (x < 0)
            x = -x;

        if (x < 69) {
            System.out.println("Given input's magnitude is less than 69.");
        } else {
            System.out.println("Given input's magnitude is not less than 69.");
        }

        sc.close();
    }
}