package patterns;
import java.util.Scanner;

public class p4 {
    public static void main(String [ ]args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        

        //using for loop
        int num=1;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(num);
        //         num+=1;
        //     }
        //     System.out.println();
        // }

        //using while loop
        int i=0;
        while(i<n){
            int j=0;
            while(j<n){
                System.out.print(num);
                j+=1;
                num+=1;
            }
            i+=1;
            System.out.println();
        }

        scanner.close();
    }
}
