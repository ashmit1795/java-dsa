/*
Ques: Print the given pattern

AAAA
BBBB
CCCC
DDDD
*/

import java.util.Scanner;

class program6 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        n = sc.nextInt();
        if(n > 26 || n < 1){
            sc.close();
            throw new Error("'n' should be in range 1 to 26");
        }
        for (int i = 65; i <= (65 + n -1); i++) {
            for (int j = 65; j <= (65 + n - 1); j++) {
                System.out.print((char)i + " ");
            }
            System.out.println();
        }

        sc.close();
    }

}
