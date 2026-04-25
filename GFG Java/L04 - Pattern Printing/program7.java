/*

HW: Print the given pattern

1 aaaa
2 BBBB
3 cccc
4 DDDD
*/

import java.util.Scanner;

class program7 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        n = sc.nextInt();

        if (n > 26 || n < 1) {
            sc.close();
            throw new Error("'n' should be in range 1 to 26");
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 0) {
                    System.out.print((char)(i + 64) + " ");
                } else {
                    System.out.print((char)(i + 96) + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
