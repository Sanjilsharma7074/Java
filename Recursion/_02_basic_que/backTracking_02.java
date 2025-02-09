package _02_basic_que;
import java.util.Scanner;

public class backTracking_02 {
    //to print from N to 1, using backtracking(here we'll void decrement, and also print the output after the recursion statement).

    static void print(int i, int n){
        if(i>n) return;
        print(i+1,n);
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(1,n);
        in.close();
    }
}
