package Code;

class Node {
  int data;
  Node next;

  Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  Node(int data) {
    this.data = data;
    next = null;
  }
}

public class Array2LL {
  static Node convertArr2LL(int[] arr){
    Node head = new Node(arr[0]);
    Node mover = head;
    for(int i=1 ; i<arr.length ; i++){
      Node temp = new Node(arr[i]);
      mover.next = temp;
      mover = temp;
    }
    return head;
  }

  public static void main(String[] args) {
    int[] arr = {12,34,5,6,7};
    Node head = convertArr2LL(arr);
    System.out.println(head.data);
  }
}
