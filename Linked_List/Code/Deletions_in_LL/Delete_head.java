package Code.Deletions_in_LL;

class Node{
  int data;
  Node next;
  Node(int data , Node next){
    this.data = data;
    this.next = next;
  }
  Node(int data){
    this.data = data;
    next = null;
  }
}

public class Delete_head {

  static Node deleteHead(Node head){
    if(head == null) return head;
    head = head.next;
    return head;
  }

  static Node getHead(int[] arr){
    Node head = new Node(arr[0]);
    Node mover = head;
    for(int i=1 ; i<arr.length ; i++){
      Node temp = new Node(arr[i]);
      mover.next = temp;
      mover = temp;
    }

    return head;
  }

  static void print(Node head){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
  }

  public static void main(String[] args) {
    int[] arr = {12, 34, 56, 78};
    Node head = getHead(arr);
    head = deleteHead(head);
    print(head);  // 34 56 78
  }
}
