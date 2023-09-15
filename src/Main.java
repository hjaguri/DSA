public class Main {
    public static void main(String[] args) {
       QueueLinkedList l=new QueueLinkedList();
       l.push(10);
       l.push(20);
       l.push(30);
       l.push(40);
       l.push(50);
       l.printQueue();
        System.out.println();
        l.pop();
        l.printQueue();
        System.out.println();
        l.pop();
        l.printQueue();
        System.out.println();
        l.push(100);
        l.printQueue();
        System.out.println();
        l.pop();
        l.pop();
        l.pop();
        l.pop();
        l.printQueue();
    }
}

class Queue{
    int size;
    int arr[];
    int rear=-1;
    public Queue(int x){
        this.size=x;
        arr=new int[x];
    }

    public void push(int x){ // This is a push operation in queue

        rear++;
        arr[rear]=x;
    }

    public void pop(){ //delete the element from queue
        if(rear==-1){
            System.out.println("Empty");
        }

        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
    }

    public void printQueue(){ // print the queue
        for(int i=0;i<=rear;i++){
            System.out.print(arr[i] + " ");
        }
    }

}