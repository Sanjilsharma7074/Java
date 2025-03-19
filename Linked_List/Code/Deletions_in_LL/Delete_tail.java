package Code.Deletions_in_LL;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    next = null;
  }
}

public class Delete_tail {

  static Node getHead(int[] arr) {
    Node head = new Node(arr[0]);
    Node mover = head;
    for (int i = 1; i < arr.length; i++) {
      Node temp = new Node(arr[i]);
      mover.next = temp;
      mover = temp;
    }
    return head;
  }

  static Node deleteTail(Node head) {
    if (head == null || head.next == null)
      return null;
    Node temp = head;
    while (temp.next.next != null) {
      temp = temp.next;
    }
    temp.next = null;
    return head;
  }

  static void print(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 12, 43, 56, 87 };
    Node head = getHead(arr);
    head = deleteTail(head);
    print(head);
  }
}
