public class QueueLinkedList {

    Node rear , front;
    public QueueLinkedList(){
        rear=null;
        front=null;
    }

    public void push(int x){
        Node n= new Node(x);
        if(rear==null){
            front=rear=n;
        }
        rear.next=n;
        rear=n;
    }

    public void pop(){
        if(front==null || rear==front){
            System.out.println("Empty");
        }
        front=front.next;
    }

    public void printQueue(){
        Node curr=front;
        while (curr!=null){
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
    }

}


class Node{
    int data;
    Node next;
    public Node(int x){
        this.data=x;
        this.next=null;
    }
}