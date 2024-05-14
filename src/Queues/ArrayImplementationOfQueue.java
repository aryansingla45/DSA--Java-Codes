package Queues;

public class ArrayImplementationOfQueue {

    public static class QueueArray{

        //In a Queue , the element is added from the last and deleted/looked from the Front.
        int capacity = 5;
        int[] arr = new int[capacity];
        int front = -1;
        int last = -1;
        int size = 0;

        void display(){
            for (int i = front; i <= last; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        void add(int val) throws Exception{
            if(size==0){
                front = last = 0;
                arr[front] = val;
                size++;
                return;
            }
            else if(size >= capacity){
                throw new Exception("Queue is full");
            }
            arr[++last] = val;
            size++;
        }

        int poll() throws Exception{
            if(size == 0) {
                throw new Exception("The Queue is Empty");
            }
            int x = arr[front];
            front++;
            size--;
            return x;
        }

        int peek() throws Exception{
            if(size == 0){
                throw new Exception("The Queue is Empty");
            }
            int x = arr[front];
            return x;
        }

        boolean isEmpty(){
            return size == 0;
        }


    }
    public static void main(String[] args) throws Exception{
        QueueArray q = new QueueArray();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println();


    }
}
