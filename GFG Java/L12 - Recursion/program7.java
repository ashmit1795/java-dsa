/*
Sum of 1 to n using recursion
*/

import java.util.Scanner;

class program7 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();

        System.out.println(sum(n));

        sc.close();
    }
    
    static int sum(int num) {
        if (num == 0)
            return 0;

        return num + sum(num - 1);
    }
    
}
