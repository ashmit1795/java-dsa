/*
    Reversing an Array using Recursion
*/

class program14 {

    public static void main(String[] args) {
        int[] arr = { 10, 13, 14, 16, 77, 88, 79, 26 };
        int n = arr.length;
        printArray(arr, 0);
        reverseArray(arr, 0, n - 1);
        System.out.println();
        printArray(arr, 0);
    }

    static void reverseArray(int arr[], int start, int end) {
        if (start > end)
            return;
        // swap first and last element
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, start + 1, end - 1);
    }

    static void printArray(int arr[], int idx) {
        if (idx == arr.length)
            return;
        System.out.print(arr[idx] + " ");
        printArray(arr, idx + 1);
    }
}