package patterns;

import java.util.Scanner;
public class p1{
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();

        //using for loop

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //using while loop

        // int i=0;
        // while(i<n){
        //     int j=0;
        //     while(j<n){
        //         System.out.print("*");
        //         j+=1;
        //     }
        //     System.out.println();
        //     i+=1;
        // }
        scanner.close();
    }
}