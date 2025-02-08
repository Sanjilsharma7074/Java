package Understanding_recursion;

public class print_n_times_1{

    // since we do not have a base condition for our code, hence we will encounter stack overflow for this code in the compiler.
    //stackoverflow / segmentation fault -> when there are numerous function calls waiting due to recursion.
    static void print(){
        System.out.println(1);
        print();
    }
    public static void main(String[] args) {
        print();
    }
}