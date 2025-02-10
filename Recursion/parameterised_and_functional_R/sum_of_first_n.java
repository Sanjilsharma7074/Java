package parameterised_and_functional_R;
import java.util.Scanner;
public class sum_of_first_n {
    //Finding the sum of first N natural numbers using the parameterised way.
    static void sum(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sum(i-1,sum+i);

    }
    static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        sum(n,sum);
    }
}
