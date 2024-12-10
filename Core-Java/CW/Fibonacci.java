import java.util.Scanner;;
public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int n1=0;
        int n2=1;
        System.out.println(n1);
        System.out.println(n2);

        
        for(int i=2;i<n;i++){
            int nextTerm=n1+n2;
            System.out.println(nextTerm);
            n1=n2;
            n2=nextTerm;
        }
    }
}
