package _01_understanding_recursion;
import java.util.Scanner;
public class one_to_n {

    static void printN(int n){
        if(n<1) return;
        printN(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printN(n);
        in.close();
    }
}