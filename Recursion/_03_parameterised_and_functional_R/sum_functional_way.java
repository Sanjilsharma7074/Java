package _03_parameterised_and_functional_R;
import java.util.Scanner;
public class sum_functional_way {

    static int sum(int n){
        if(n==0) return 0;
        return n + sum(n-1);
    }

    static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }
}
