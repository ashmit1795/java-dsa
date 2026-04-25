/*
Ques: Print the given pattern
n = 4
    1 2 3 4                 j = 1 to (n-i+1)
1   * * * *     1 -> 4      j = 1 to 4
2   * * *       2 -> 3      j = 1 to 3
3   * *         3 -> 2      j = 1 to 2
4   *           4 -> 1      j = 1 to 1

OR

1 2 3 4 
1 2 3
1 2
1

OR

a b c d
a b c
a b
a

OR

A A A A
B B B
C C
D

* Star Triangle Horizontally Flipped
*/

import java.util.Scanner;

class program10 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // for (int j = n; j >= i; j--) {
            //     System.out.print("* ");
            // }
            for (int j = 1; j <= (n-i+1); j++) {
                // System.out.print("* ");
                // System.out.print(j + " ");
                // System.out.print((char)(j+96) + " ");
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
