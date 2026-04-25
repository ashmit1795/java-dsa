/*
HW: Print the given pattern
    1 2 3 4 5
1   1
2   A B
3   1 2 3
4   A B C D
5   1 2 3 4 5

* Alphanumeric Triangle
*/

import java.util.Scanner;

class program9 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print((char)(j+64) + " ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }

}
