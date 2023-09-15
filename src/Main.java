public class Main {
    public static void main(String[] args) {
       Queue q=new Queue(5);
       q.push(2);
        q.push(10);
        q.printQueue();
        System.out.println();
        q.pop();
        q.printQueue();
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

    public void push(int x){

        rear++;
        arr[rear]=x;
    }

    public void pop(){
        if(rear==-1){
            System.out.println("Empty");
        }
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
    }

    public void printQueue(){
        for(int i=0;i<=rear;i++){
            System.out.print(arr[i] + " ");
        }
    }

}