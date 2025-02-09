package _02_basic_que;
import java.util.Scanner;
public class reverse {

    //to print the sequence in reverse order (from N to 1).
    static void print(int n, int i){
        if(n<i) return;
        System.out.print(n+" ");
        print(n-1,i);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(n,1);
        in.close();
    }
}
