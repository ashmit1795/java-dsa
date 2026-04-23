/*
    Sum of an AP using Loops
*/

import java.util.Scanner;

class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        int n = sc.nextInt();
        System.out.print("Enter 'a': ");
        int a = sc.nextInt();
        System.out.print("Enter 'd': ");
        int d = sc.nextInt();

        int sum = a;
        int next = a;
        for (int i = 2; i <= n; i++) {
            next += d;
            sum += next;
        }

        System.out.println("\n Sum = " + sum);
        
        sc.close();
    }
}
