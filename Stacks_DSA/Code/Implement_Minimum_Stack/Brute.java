package Code.Implement_Minimum_Stack;
import java.util.Stack;
import java.util.AbstractMap.SimpleEntry;

class MyStack{
  Stack <SimpleEntry<Integer , Integer>> st = new Stack<>();
  int top = 0;
  void push(int val){
    if(st.isEmpty()){
      st.push(new SimpleEntry <>(val,val));
    }else{
      st.push(new SimpleEntry<>(val,Math.min(val,st.peek().getValue())));
    }
    top++;
  }
  int top(){
    return st.peek().getKey();
  }
  int pop(){

    SimpleEntry <Integer, Integer> temp = st.pop();
    top --;
    return temp.getKey();

  }
  int getMin(){
    return st.peek().getValue();
  }
}



public class Brute {
  public static void main(String[] args) {
    MyStack st = new MyStack();
    st.push(10);
    st.push(12);
    System.out.println(st.top());
    System.out.println(st.getMin());
    st.push(15);
    st.push(9);
    System.out.println(st.top());
    System.out.println(st.getMin());
  }
}

// ! TC - O(1)
// ? SC - O(2N) => we stored a pair of DS 
