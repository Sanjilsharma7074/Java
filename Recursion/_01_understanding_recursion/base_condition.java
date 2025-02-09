package _01_understanding_recursion;
public class base_condition {

    static int count = 0;
    static void print(){
        if(count == 4) return;      //Base Condition.

        System.out.println(count);
        count ++;
        print();
        
    }
    public static void main(String[] args) {
        print();
    }
}
