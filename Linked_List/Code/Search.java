package Code;
import java.util.Scanner;

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


public class Search {

  static Node convertArr2LL(int[] arr) {
    Node head = new Node(arr[0]);
    Node mover = head;
    for (int i = 1; i < arr.length; i++) {
      Node temp = new Node(arr[i]);
      mover.next = temp;
      mover = temp;
    }
    return head;}
  static boolean search(Node head, int val){
    Node temp = head;
    while(temp != null){
      if(temp.data == val) return true;
      temp = temp.next;
    }
    return false;
  }
  
  public static void main(String[] args) {
    int[] arr = { 12, 34, 5, 6, 7 };
    Scanner sc = new Scanner (System.in);
    Node head = convertArr2LL(arr);
    System.out.print("Enter the element to be searched : ");
    int val = sc.nextInt();
    System.out.println(search(head, val));
    sc.close();
  }
}
