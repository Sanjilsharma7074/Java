package Code.Deletions_in_LL;
import java.util.Scanner;
class Node{
  int data;
  Node next;

  Node(int data){
    this.data = data;
  }
}

public class Delete_Kth {

  static void print(Node head){
    while(head!=null){
      System.out.print(head.data + " ");
      head = head.next;
    }
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
  static Node deleteKth(Node head,int k){
    if(k==1){
      head = head.next;
      return head;
    }
    int cnt = 0;
    Node temp = head;
    Node prev = null;
    while(temp!=null){
      cnt++;
      if(cnt == k){
        prev.next = prev.next.next;
        break;
      }
      prev=temp;
      temp=temp.next;
    }
    return head;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {21,32,45,67};
    System.out.print("Enter the element you wish to delete: ");
    int k = sc.nextInt();
    Node head = getHead(arr);
    head = deleteKth(head, k);
    print(head);
    sc.close();
  }
}
