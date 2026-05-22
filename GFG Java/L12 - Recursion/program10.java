/*
Ways to Reach the n'th Stair

There are n stairs, a person standing at the bottom wants to reach the top. 
The person can climb either 1 stair or 2 stairs at a time. 
Your task is to count the number of ways, the person can reach the top (order does matter).

*/

import java.util.Scanner;

class program10 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();

        System.out.println("Ways = " + countWays(n));

        sc.close();
    }
    
    static int countWays(int n) {
        if(n == 1 || n == 2) return n;
        int ways = countWays(n - 1) + countWays(n - 2);
        return ways;
    }
}