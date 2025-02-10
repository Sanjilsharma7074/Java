package parameterised_and_functional_R;
import java.util.Scanner;
public class factorial {
    static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
        sc.close();
        
    }
}
