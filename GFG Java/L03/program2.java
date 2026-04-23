/*
Ques: Display this GP - 1,2,4,8 .. upto 'n' terms
*/

import java.util.Scanner;

class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        int n = sc.nextInt();

        long a = 1, r = 2;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a *= r;
        }
        sc.close();
    }
}