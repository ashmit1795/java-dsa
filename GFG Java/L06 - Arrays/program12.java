/*


*/

import java.util.Scanner;
import java.util.Vector;

class program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        Vector<Integer> arr1 = addOne(arr);

        System.out.print("After adding one: ");
        System.out.println(arr1);

        sc.close();
    }

    static Vector<Integer> addOne(int[] arr) {
        int n = arr.length;
        Vector<Integer> result = new Vector<>();

        // Copy elements first
        for (int num : arr) {
            result.add(num);
        }

        // Add one from last
        for (int i = n - 1; i >= 0; i--) {
            if (result.get(i) < 9) {
                result.set(i, result.get(i) + 1);
                return result;
            } else {
                result.set(i, 0);
            }
        }

        // If all digits were 9
        result.add(0, 1);

        return result;
    }
    
}
