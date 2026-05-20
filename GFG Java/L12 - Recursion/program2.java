/*
 Print 1 to n using recursion
*/

import java.util.Scanner;

class program2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        print(n);

        sc.close();
    }

    // static void print(int start, int end){
    //	System.out.println(start);
    //	if(start == end) return;
    //	print(start + 1, end);
    // }

    static void print(int n) {
        if (n == 0)
            return;
        print(n - 1);
        System.out.print(n + " ");
    }

}
