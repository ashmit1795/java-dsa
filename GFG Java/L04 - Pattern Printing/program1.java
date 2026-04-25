/*
    Print this pattern:

    * * * * *
    * * * * *
    * * * * *
    * * * * *
*/

import java.util.Scanner;

class program1 {
    public static void main(String[] args) {
        int rows, cols;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
