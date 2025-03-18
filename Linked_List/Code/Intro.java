package Code;

class Node{
  int data;
  Node next;

  Node(int data, Node next){
    this.data = data;
    this.next = next;
  }
  Node(int data){
    this.data = data;
    next = null;
  }
}

public class Intro {
  public static void main(String[] args) {
    int[] arr = {2,5,8,9};
    Node y = new Node (arr[0]);
    System.out.println(y.data);
    System.out.println(y.next);
  }
}
