package _02_basic_que;
import java.util.Scanner;
public class linearly {
    //print linearly from 1 to N.

    static void print(int i, int n){
        if(i>n) return;
        System.out.print(i+" ");
        print(i+1,n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(1,n);
        in.close();
    }
}
