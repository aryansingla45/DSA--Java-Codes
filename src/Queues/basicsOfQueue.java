package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class basicsOfQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(6);
        q.add(7);
        System.out.println(q);
        q.poll();
        System.out.println(q);


        //Queue Display
        //Circular queue linked list implementation
        //Deque



    }
}
