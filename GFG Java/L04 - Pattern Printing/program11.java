/*
* HOLLOW RECTANGLE
Ques: Print the given pattern

rows = 5
cols = 7
* * * * * * *
*           *
*           *
*           *
* * * * * * *

*/

import java.util.Scanner;

class program11 {
    public static void main(String[] args) {
        int rows, cols;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // if (i == 1 || i == rows) {
                //     System.out.print("* ");
                // } else {
                //     if (j == 1) {
                //         System.out.print("*");
                //     }else if(j == cols){
                //         System.out.print(" *");

                //     } else {
                //         System.out.print("  ");
                //     }
                // }
                if(i == 1 || i == rows || j == 1 || j == cols){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
