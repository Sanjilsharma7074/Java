package Understanding_recursion;

public class print_n_times_2 {

    static int count = 0;
    static void print(){
        System.out.println(count);
        count ++;
        print();

    }
    public static void main(String[] args) {
        print();
    }
}
