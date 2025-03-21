package Arrays.Move_Zeros_to_end;

import java.util.Scanner;

//using the 2 pointer approach

public class Optimal {
    
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int[] moveZeros(int n, int[] a) {
        // Write your code here.
        int j = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1)
            return a;
        for (int i = j + 1; i < a.length; i++) {
            if (a[i] != 0) {
                swap(a, i, j);
                j++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ;  i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Actual array : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        moveZeros(n,arr);
        System.out.println();
        System.out.print("Array after variation : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
