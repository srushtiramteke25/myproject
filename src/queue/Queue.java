package queue;

public class Queue {

    private int rear;
    private int arr[];
    private int front;
    private final int SIZE;

    public Queue(int size) {
        this.SIZE = size;
        arr = new int[SIZE];
        rear = -1;
        front = -1;
    }

    public void push(int num){
        rear++;
        arr[rear] = num;
    }

    public int pop(){
       int temp =  arr[front+1];
        front++;
        return temp;
    }

    public int peek(){
        return arr[front+1];
    }

    public boolean isEmpty(){
        return !(front==rear);
    }

    public boolean isFull(){
        return (rear==SIZE-1);
    }
}
