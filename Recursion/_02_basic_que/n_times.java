package _02_basic_que;
import java.util.Scanner;
public class n_times{

    // to print a name n times using recursion

    static void print(int i, int n){
        if(i>n) return;
        System.out.println(i+". Sanjil");
        print(i+1,n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(1,n);
        in.close();
    }
}