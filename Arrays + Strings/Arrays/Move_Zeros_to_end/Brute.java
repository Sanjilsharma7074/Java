package Arrays.Move_Zeros_to_end;

import java.util.Scanner;
import java.util.ArrayList;


public class Brute {
    static int[] move_zeroes(int n, int []arr){

        ArrayList <Integer> temp = new ArrayList<>();
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] != 0) temp.add(arr[i]);
        }
        for(int i=0 ; i<temp.size() ; i++){
            arr[i] = temp.get(i);
        }
        for( int i=temp.size() ; i<arr.length ; i++){
            arr[i]=0;
        }

        return arr;
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
        move_zeroes(n, arr);
        System.out.println();
        System.out.print("Array after variation : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
