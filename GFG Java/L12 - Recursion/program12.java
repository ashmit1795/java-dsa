/*
Linear Search on Array using Recursion
*/

class program12 {

    public static void main(String[] args) {
        int[] arr = { 10, 13, 14, 16, 77, 88, 79, 26 };
        System.out.println(linearSearch(arr, 0, 36));

    }
    
    static int linearSearch(int arr[], int idx, int target) {
        if (idx == arr.length)
            return -1;
        if (arr[idx] == target)
            return idx;
        return linearSearch(arr, idx + 1, target);
    }
}