package Arrays.Left_rotate_an_array_by_D_places;

import java.util.ArrayList;
import java.util.Scanner;

public class Optimised {
    
    static void reverse(ArrayList<Integer> arr, int start, int end) {
        while (start < end) { // Fix: Use < instead of <= to avoid unnecessary swaps
            int temp = arr.get(start);
            arr.set(start, arr.get(end)); // Swap start with end
            arr.set(end, temp); // Swap end with start
            start++;
            end--;
        }
    }
    
    static void rotate_left(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        k = k % n; // Handle cases where k > n

        // Step 1: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 2: Reverse remaining n-k elements
        reverse(arr, k, n - 1);

        // Step 3: Reverse entire array
        reverse(arr, 0, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter the length of arraylist : ");
        int n = sc.nextInt();
        // Initializing ArrayList with default values (0) to avoid
        // IndexOutOfBoundsException
        for (int i = 0; i < n; i++) {
            arr.add(0);
        }

        // Taking input using .set()
        for (int i = 0; i < n; i++) {
            arr.set(i, sc.nextInt());
        }
        System.out.print("Please enter the value of the k : ");
        int k = sc.nextInt();
        System.out.print("Array before rotation : ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        rotate_left(arr, k);
        System.out.println();
        System.out.print("Array after rotation : ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        sc.close();
    }
}
