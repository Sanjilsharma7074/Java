package Arrays.Left_rotate_an_array_by_D_places;

import java.util.Scanner;
import java.util.ArrayList;

public class Brute {
    static ArrayList<Integer> rotate_left(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> temp = new ArrayList<>();
        int n = arr.size();
        k = k % n;

        for (int i = 0; i < k; i++) {
            temp.add(arr.get(i));
        }
        for (int i = k; i < n; i++) {
            arr.set(i - k, arr.get(i));
        }
        for (int i = n - k; i < n; i++) {
            arr.set(i, temp.get(i - (n - k)));
        }
        return arr;
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
