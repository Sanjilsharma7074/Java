package _05_multiple_recursion_calls;
import java.util.Scanner;

//to find the nth fibonacci number.
public class fibonacci {
    static int fib(int n){
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter which fibonacci number you want: ");
        int n = in.nextInt();
        System.out.println(fib(n));
        in.close();
    }
}
