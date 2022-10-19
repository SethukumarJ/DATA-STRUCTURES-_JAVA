import java.util.*;


class Node {

    int data;
    Node next;
    

    Node(int data){
        this.data = data;
    }
}

public class SinglyLinkedLIst{
    



    

public Node head = null;
public Node tail = null;


public void addNode(int data){

    Node newNode = new Node(data);


    if (head==null){
        head = newNode;
    }
    else {

        tail.next = newNode;

    }
    tail = newNode;

}




public void display(){

    if(head ==null){
        System.out.println("List is empty");
        return;
    }

    Node temp = head;


    while (temp != null){
        System.out.println(temp.data);
        temp = temp.next;
    }
    
}
public void delete(int data){
    Node prev = null;

    Node temp = head;

    if(temp != null && temp.data == data) {
        
        head = temp.next;
        return;
    }

    while(temp != null && temp.data != data){
        prev = temp;
        temp = temp.next;
    }

    prev.next = temp.next;

   
  
}

public void insert(int nextTo, int data){
   Node newNode = new Node(data);

   Node temp = head;

   while(temp != null && temp.data != nextTo){
        temp = temp.next;
        
   }

   if(temp == null){
    return;

   }

   if(temp == tail){

    tail.next = newNode;
    tail = newNode;

   return;
   }


  
   newNode.next = temp.next;
   temp.next = newNode;



}


public static void main(String[] args){

    SinglyLinkedLIst list = new SinglyLinkedLIst();



    list.addNode(10);
    list.addNode(20);
    list.addNode(30);
    list.insert(10, 20);
    list.display();
}
}
