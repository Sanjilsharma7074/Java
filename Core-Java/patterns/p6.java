package patterns;
import java.util.Scanner;

public class p6 {
    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            int num=i+1;
            for(int j=0;j<=i;j++){
                System.out.print(num);
                num--;
            }
            System.out.println();
        }
        scanner.close();
    }
}
