/*
Ques: Print the given pattern

1111
2222
3333
4444
*/

import java.util.Scanner;

class program4 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        n = sc.nextInt();
        if (n < 0) {
            sc.close();
            throw new Error("'n' is not valid.");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }

}
