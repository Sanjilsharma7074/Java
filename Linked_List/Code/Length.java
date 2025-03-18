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

public class Length {
  static Node convertArr2LL(int[] arr) {
    Node head = new Node(arr[0]);
    Node mover = head;
    for (int i = 1; i < arr.length; i++) {
      Node temp = new Node(arr[i]);
      mover.next = temp;
      mover = temp;
    }
    return head;
  }
  static int length(Node head){
    int cnt=0 ;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      cnt++;
    }
    return cnt;
  }

  public static void main(String[] args) {
    int[] arr = { 12, 34, 5, 6, 7 };
    Node head = convertArr2LL(arr);
    System.out.print("Length of the LL is : "+length(head));
  }
}
