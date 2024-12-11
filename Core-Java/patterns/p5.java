package patterns;
import java.util.Scanner;
public class p5 {
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        int n=scanner.nextInt();

        //using for loop

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
