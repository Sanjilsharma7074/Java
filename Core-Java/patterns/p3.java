package patterns;
import java.util.Scanner;

public class p3 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        //using for loop

        // for(int i=0;i<n;i++){
        //     int num=1;
        //     for(int j=0;j<n;j++){
        //         System.out.print(num);
        //         num+=1;
        //     }
        //     System.out.println();
        // }

        //using while loop

        int i=1;
        while(i<n){
            int j=0;
            int num=1;
            while(j<n){
                System.err.println(num);
                j+=1;
                num+=1;
            }
            System.out.println();
            i+=1;
        }

        scanner.close();
    }
}
