/*
* Rhombus
        * * * *
      * * * *
    * * * *
  * * * *

    1 2 3 4 5 6 7 8 9
1   # # # # * * * * #
2   # # # * * * * # #
3   # # * * * * # # #
4   # * * * * # # # #

*/


import java.util.Scanner;

public class program18 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
