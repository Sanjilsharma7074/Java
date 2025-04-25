package Code;

class Node{
  int data;
  Node next;

  Node(int data){
    this.data = data;
    this.next = null;
  }
}

class MyStack{
  Node top = new Node(0);
  int size = 0;

  void push(int x){
    Node newNode = new Node(x);
    newNode.next = top;
    top = newNode;
    size+=1;
  }
  int  pop(){
    Node temp = top;
    if(size == 1){
      top = null;
    }
    else{
      top = top.next;
    }
    size-=1;
    return temp.data;
  }
  int size(){
    return size;
  }
  int top(){
    return top.data;
  }
}


public class Implement_Stack_using_LL {
  public static void main(String[] args) {
    MyStack arr = new MyStack();
    arr.push(4);
    arr.push(2);
    arr.push(3);
    arr.push(1);
    System.out.println(arr.top());
    System.out.println(arr.pop());
    arr.push(7);
    System.out.println(arr.top());
    System.out.println(arr.size());
    System.out.println(arr.pop());
    System.out.println(arr.pop());
    System.out.println(arr.pop());
    System.out.println(arr.pop());
  }
}
