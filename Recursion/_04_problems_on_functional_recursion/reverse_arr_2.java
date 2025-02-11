package _04_problems_on_functional_recursion;
import java.util.Scanner;
public class reverse_arr_2 {
    static void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    static void reverse(int i,int[] arr){
        if(i>=arr.length/2){
            return;
        }
        swap(i,arr.length-i-1,arr);
        reverse(i+1,arr);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the length you want for your array: ");
        int len = in.nextInt();
        int[] arr = new int[len];
        for(int i=0 ; i<len ; i++){
            arr[i] = in.nextInt();
        }
        reverse(0,arr);
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
}
