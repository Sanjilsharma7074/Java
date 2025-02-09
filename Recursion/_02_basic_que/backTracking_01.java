package _02_basic_que;
import java.util.Scanner;

public class backTracking_01 {
    // to print from 1 to N using backtracking(not to use increment operator, to print the output after recursion calls).
    static void print(int i, int n){
        if(i<1) return;
        print(i-1,n);
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(n,n);
        in.close();
    }
}
