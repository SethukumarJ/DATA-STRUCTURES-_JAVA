import java.util.*;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
    }

}

public class Doubly {

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;

        } else {
            tail.next = newNode;
            newNode.prev = tail;

        }
        tail = newNode;

    }

   

    public Doubly twister(Doubly link, Doubly dlink) {
        Node currentNode = link.tail;

        while(currentNode != null){
            dlink.addNode(currentNode.data);

            currentNode = currentNode.prev;



            }
            currentNode = dlink.head;
            Node temp = link.head;

            while(currentNode != null){
                temp.data = currentNode.data;
                currentNode = currentNode.next;
                temp = temp.next;
            }
            return link;
        
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Doubly link1 = new Doubly();
        Doubly link2 = new Doubly();

        link1.addNode(10);
        link1.addNode(20);
        link1.addNode(30);
        link1.addNode(40);
        link1.addNode(50);

        link1 = link1.twister(link1, link2);
        link1.display();

    }

}
