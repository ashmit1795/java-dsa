/*
* Binary Triangle

HW: Print the given pattern
    1 2 3 4 5
1   1
2   1 3
3   1 3 5
4   1 3 5 7
5   1 3 5 7 9

*/

import java.util.Scanner;

class program16 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int a = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print(j + a + " ");
                a++;
            }
            System.out.println();
        }

        sc.close();
    }

}
