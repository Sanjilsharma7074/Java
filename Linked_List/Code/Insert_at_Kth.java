package Code;

import java.util.Scanner;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
  }
  Node(int data,Node next) {
    this.data = data;
    this.next = next;
  }
}

public class Insert_at_Kth {

  static void print(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
  }

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

  static Node insert(Node head, int ele, int k){
    if(head == null){
      if(k==1) return new Node(ele);
    }
    else{
      return head;
    }
    if(k==1){
      return new Node(ele,head);
    }
    int cnt = 0;
    Node temp = head;
    while(temp != null){
      cnt ++;
      if(cnt)
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = { 21, 32, 45, 67 };
    System.out.print("At what position would you like to insert : ");
    int k = sc.nextInt();
    System.out.println("Enter the value of teh element you want to insert : ");
    int ele = sc.nextInt();
    Node head = getHead(arr);
    head = insert(head, ele, k);
    print(head);
    sc.close();
  }
}
