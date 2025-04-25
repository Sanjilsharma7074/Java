package Code;
class MyStack{
  int top = -1;
  int size = 10;
  int[] st = new int[size];
  
  void push(int x){
    if(top == size-1) {
      System.out.println("Top exceeds the length");
      return;
    }
    top+=1;
    st[top]=x;
  }

  int top(){
    if(top == -1) System.out.println("Invalid value of top.");
    return st[top];
  }

  int pop(){
    if(top == -1) System.out.println("Invalid value of top.");
    int temp = st[top];
    top-=1;
    return temp;
  }

  int size(){
    return top+1;
  }
}

public class Implement_Stack_using_Arrays {
  public static void main(String[] args) {
    MyStack st = new MyStack();
    st.push(1);
    st.push(2);
    st.push(3);
    System.out.println(st.top());
    st.push(4);
    st.push(5);
    st.push(6);
    st.push(7);
    System.out.println(st.size());
    st.push(8);
    st.push(9);
    st.push(10);
    System.out.println(st.top());
    st.push(11);
    System.out.println(st.top());
  }
}

// ? Time complexity of every operation is O(1)

// ! Space complexity is not dynamic in nature - we took O(10) space but there might be cases where we use only O(3) or O(4) or O(any constant)