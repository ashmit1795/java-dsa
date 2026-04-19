// Ques: Take real number input and check if it is an integer or not.

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a real number: ");
        double n = sc.nextDouble();
        System.out.println(n%1);
        if (n % 1 == 0) {
            System.out.println(n + " is an integer.");
        } else {
            System.out.println(n + " is not an integer.");
        }

        // 2nd Approach
        int x = (int) n;
        if(n-x > 0) System.out.println(n + " is not an integer.");
        else System.out.println(n + " is an integer.");
        sc.close();
    }
}