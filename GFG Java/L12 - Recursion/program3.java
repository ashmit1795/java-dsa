/*
Ques: Increasing-Decreasing

Expected o/p: 5 4 3 2 1 2 3 4 5
*/

import java.util.Scanner;

class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
    
    static void print(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        print(n - 1);
        System.out.print(n + " ");
    }
}
