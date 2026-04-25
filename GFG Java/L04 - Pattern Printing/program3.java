/*
Ques: Print the given pattern

ABCD
ABCD
ABCD
ABCD
*/

import java.util.Scanner;

class program3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        n = sc.nextInt();
        if(n > 26 || n < 1){
            sc.close();
            throw new Error("'n' should be in range 1 to 26");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 65; j <= (65 + n - 1); j++) {
                System.out.print((char)j + " ");
            }
            System.out.println();
        }

        sc.close();
    }

}
