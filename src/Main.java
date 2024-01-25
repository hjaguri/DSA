import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        CircularQueue c=new CircularQueue();
        c.enqueue(1);
        c.enqueue(2);
        c.enqueue(3);
        c.enqueue(4);
        c.enqueue(5);
        c.display(); // 1 2 3 4 5
        c.dequeue();
        c.display();
        c.dequeue();
        c.display();
        c.enqueue(6);
        c.enqueue(6);

        c.display();

    }
}
class CircularQueue{
    int rear=-1;
    int front=-1;
    int size=5;
    int arr[]=new int[5];
    public void enqueue(int x){
        if(((rear+1)%size)==front){
            System.out.println("Queue is fulled.......");
        }else if(rear==-1 && front==-1){
            rear=front=0;
            arr[rear]=x;
        }else{
            rear=(rear+1)%size;
            arr[rear]=x;
        }
    }

    public int dequeue(){
        int value=0;
        if(rear==-1 && front==-1){
            System.out.println("Queue is Empty");
        }else{
            value=arr[front];
            front = (front+1)%5;
        }
        return value;
    }
    public void  display(){
        int i=front;
        do{
            System.out.print(arr[i] + " ");
            i=(i+1)%size;
        }while (i!=(rear+1)%size);
        System.out.println();

    }
}
