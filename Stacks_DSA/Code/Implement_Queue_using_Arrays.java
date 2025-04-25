package Code;
class MyStack{
  int size = 4;
  int currSize = 0;
  int start = -1;
  int end = -1;
  int[] Q = new int[size];

  void push(int x){
    if(currSize == size) return;
    else if(currSize == 0 ){
      start = 0;
      end = 0;
    }
    else{
      end = (end+1) % size;
    }
    currSize+=1;
    Q[end] = x;
  }
  int pop(){
    if(currSize == 0) return -1;
    int temp = Q[start];
    if(currSize != 1){
      start+=1;
      return temp;
    }
    else{
      start = -1;
      end = -1;
    }
    currSize -= 1;
    return temp;
  }
  int top(){
    if(currSize == 0) return -1;
    return Q[start];
  }
  int size(){
    return currSize;
  }
}

public class Implement_Queue_using_Arrays {
  public static void main(String[] args) {
    MyStack Q = new MyStack();
    Q.push(1);
    Q.push(2);
    Q.push(3);
    Q.push(4);
    System.out.println(Q.pop());
    System.out.println(Q.pop());
    System.out.println(Q.size());
    System.out.println(Q.top());
    System.out.println(Q.pop());
    System.out.println(Q.top());
    System.out.println(Q.size());
    System.out.println(Q.pop());
    System.out.println(Q.size());
  }
}
