/*
HW: Take 'n' as input from user and
print the following sequence ..

1
n
2
n-1
3
n-2
...
*/

import java.util.Scanner;

class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        int n = sc.nextInt();
        System.out.println(1);
        System.out.println(n);
        for (int i = 2; i <= n;i++ ){
            System.out.println(i);
            System.out.println(n-i+1);
        }

        sc.close();
    }
}
