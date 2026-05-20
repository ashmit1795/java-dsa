/*
Factorial of a number using recursion
*/

class program4 {
    public static void main(String[] args) {
        System.out.println(fact(2));
    }
    
    static int fact(int n) {
        if (n == 1 || n == 0)
            return 1;

        return n * fact(n - 1);
    }
}