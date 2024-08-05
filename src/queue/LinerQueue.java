package queue;

import java.util.Arrays;

public class LinerQueue {
    public static void main(String args[]) {
     Queue queue = new Queue(5);
     queue.push(9);
     for(int i=0;i<7;i++){
         if(!queue.isFull()){
             queue.push(i+1);
         }
     }
     System.out.println(queue.pop());
     System.out.println(queue.peek());
     System.out.println(queue.pop());
    }
}
