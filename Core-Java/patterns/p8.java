package patterns;
import java.util.Scanner;

public class p8 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i+1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}

//n=3
// i=1, j= should be run 3 time ,j=3, n-i+1
//i=2, j= should run 2 times , j=2 ,n-i+1
//i=3, j= should run 1 times , j=1 ,n-i+1