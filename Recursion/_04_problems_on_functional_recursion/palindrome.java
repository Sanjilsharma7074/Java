package _04_problems_on_functional_recursion;
import java.util.Scanner;
public class palindrome {
    static Boolean isPalindrome(int i,char[] arr){
        if(i>=(arr.length/2)) {return true;}
        if(arr[i]!=arr[arr.length-i-1])  {
            return false;
        }
        return isPalindrome(i+1, arr);
    }
    //to check if a string is a plaindrome or not. MADAM is a palindrome string.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        str = str.toLowerCase();
        char[] ch = str.toCharArray();
        // for(char c: ch){
        //     System.out.print(c+" ");
        // }
        System.out.println(isPalindrome(0,ch));
        in.close();
    }
}
