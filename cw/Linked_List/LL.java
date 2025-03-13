package Linked_List;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LL{

    Node head;

    void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return ;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;

    }

    void printList(){
        
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.add(10);
    }
}