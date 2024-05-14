package Queues;

public class ArrayIofCQueue {
    public static class CircularQueue{
        int capacity = 5;
        int[] arr = new int[capacity];
        int front = -1;
        int rear = -1;
        int size = 0;
        void add(int data)throws Exception{
            if(size==0){
                front = rear = 0;
                arr[front] = data;
                size++;
            }
            else if(size >= capacity){
                throw new Exception("Queue is full");
            }
            else if(rear < capacity - 1){
                arr[++rear] = data;
                size++;
                return;
            }
            else if(rear ==  capacity - 1){
                rear = 0;
                arr[rear] = data;
                size++;
            }
        }

        int poll()throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty");
            } else{
                int x = arr[front];
                // Optional: Clearing the element at the front
                front = (front + 1) % capacity; // Move the front pointer in a circular manner
                size--;
                return x;
            }
        }

        int peek() throws Exception{
            if(size == 0){
                throw new Exception("Empty Queue");
            }
            int x = arr[front];
            return x;
        }

        boolean isEmpty(){
            return size ==0;
        }

        void display(){
            if(front<rear){
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            else{
                for (int i = front; i <= capacity-1; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }

    }
    public static void main(String[] args) throws Exception{
        CircularQueue cq = new CircularQueue();
        cq.add(5);
        cq.add(6);
        cq.add(7);
        cq.add(8);
        cq.add(9);
        cq.poll();
        cq.add(10);
        System.out.println(cq.peek());
        System.out.println(cq.size);
        System.out.println(cq.isEmpty());
        cq.display();
    }
}
