public class Queue {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

 public Node front = null;
 public Node rear = null;


    public void display(){

        Node current = front;


        if(current ==null){

            System.out.println("empty");
            return;
        }

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }

    }


    public void enQueue(int data){
        Node newNode = new Node(data);


        if(rear == null){
            rear =front = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }
    public void deQueue(int data){
       

        if(front == null){
            System.out.println("empty");

        }
        else{
            front = front.next;
        }





    }





    public static void main(String[] args){

        Queue fuck =  new Queue();

        
        fuck.enQueue(10);
        fuck.enQueue(20);
        fuck.enQueue(30);
        fuck.enQueue(40);
        fuck.enQueue(50);
        fuck.display();
    }
}
