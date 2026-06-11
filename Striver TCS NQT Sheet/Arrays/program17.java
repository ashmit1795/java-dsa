/*
Problem Statement: Given an array that contains both negative and positive integers, find the maximum product subarray.

Input: Nums = [1,2,3,4,5,0]
Output: 120
Explanation: 
In the given array, 1×2×3×4×5 gives maximum product value.

Input: Nums = [1,2,-3,0,-4,-5]
Output: 20
Explanation: 
In the given array, (-4)×(-5) gives maximum product value.

*/

class program17 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -3, 0, -4, -5 };

        maxProduct(arr);
    }
    
    static void maxProduct(int[] arr){
        int maxProd = arr[0];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = i; j < arr.length; j++) {
                prod *= arr[j];
                maxProd = Math.max(maxProd, prod);
            }
        }

        System.out.println(maxProd);
    }
}
