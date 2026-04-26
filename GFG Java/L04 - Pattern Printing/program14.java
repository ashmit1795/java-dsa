/*
* Floyd's Triangle

HW: Print the given pattern
    1 2 3 4 5
1   1
2   2 3
3   4 5 6
4   7 8 9 10

*/

import java.util.Scanner;

class program14 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        n = sc.nextInt();

        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }

        sc.close();
    }

}
