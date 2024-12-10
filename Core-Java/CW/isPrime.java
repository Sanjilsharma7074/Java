import java.util.Scanner;
public class isPrime {
    public static void main(String[] args)
    {Scanner scanner= new Scanner(System.in);
    int n=scanner.nextInt();
    boolean flag=true;
    for(int i=2;i<n;i++){
        if(n%i==0){
            flag=false;

            //MUST write break in order to terminate the loop where the condition has been satisfied, stopping it to analyze further elements in the loop
            break;
        }
    }
    if(flag){
        System.out.println(n+" is a prime number");
    }
    else{
        System.out.println("Not a prime");
    }
}
}
