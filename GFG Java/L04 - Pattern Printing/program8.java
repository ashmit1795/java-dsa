/*
Ques: Print the given pattern

*
* *
* * *
* * * *

OR

1
1 2
1 2 3
1 2 3 4

OR

1
2 2
3 3 3
4 4 4 4

OR

A 
A B
A B C
A B C D

OR

A
B B
C C C
D D D D
*/

import java.util.Scanner;

class program8 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // System.out.print("* "); // star triangle
                // System.out.print(j + " "); // number triangle 1
                // System.out.print(i + " "); // number triangle 2
                // System.out.print((char)(j+64) + " "); // alphabet triangle 1
                System.out.print((char)(i+64) + " "); // alphabet triangle 2


            }
            System.out.println();
        }

        sc.close();
    }
}