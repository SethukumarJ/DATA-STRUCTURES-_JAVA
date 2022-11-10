public class Stack {
    

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
        }
    }


    public Node top = null;



    public void display(){

  Node current = top;
  
 if(current ==null){
    System.out.println("empty");
    return;
 }

 while(current != null ){
    System.out.println(current.data);
    current = current.next;

    
 }



 }


 public void push(int data){

    Node newNode = new Node(data);

    if(top == null){
        top = newNode;
    }

    else{
        newNode.next = top;
        top = newNode;
    }

 }

 public void pop(){
    if(top == null){
        System.out.println("stack underflow");
        return;
    }

    else{
        top = top.next;
    }
 }





    public static void main(String[] args){

         Stack stack = new Stack();

         stack.display();
        
         stack.push(10);
         stack.push(20);
         stack.push(30);
         stack.push(40);
         stack.pop();


         stack.display();


    }
}
