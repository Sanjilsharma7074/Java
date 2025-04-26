package Code;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class MyStack{
  int size = 0;
  Node start = null;
  Node end = null;

  void push(int x){
    Node temp = new Node(x);
    if(size == 0){
      start = temp;
      end = temp;
    }
    else{
      end.next = temp;
      end = end.next;
    }
    size+=1;
  }

  int pop(){
    Node temp = start;
    if(size == 1){
      start = null;
      end = null; 
    }
    else{
      start = start.next;
    }
    size-=1;
    return temp.data;
  } 

  int top(){
    return start.data;
  }

  int size(){
    return size;
  }
}

public class Implement_Queue_using_LL {
  public static void main(String[] args) {
    MyStack st = new MyStack();
    st.push(7);
    st.push(2);
    st.push(3);
    st.push(5);
    System.out.println(st.pop());
    System.out.println(st.top());
    System.out.println(st.size());
    System.out.println(st.pop());
    System.out.println(st.top());
  }
}
