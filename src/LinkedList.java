public class LinkedList {
    Node head;
    Node tail;

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            head.previous = null;
        }
        else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        tail.next =null;
    }

    public void print(){
        Node currentNode = head;
        System.out.println("Linked List :");
        while (currentNode != null){
            System.out.println(currentNode.data + "  ");
            currentNode = currentNode.next;
        }
    }


    }


class Node {
    int data;
    Node next;
    Node previous;

    Node(int d){
        this.data = d;

    }
}
