package Queues;

public class llImplementOfQueue {
    //In a Queue , the element is added from the last(tail) and deleted/looked from the Front(head).
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static class llQueue{
        int size = 0;
        Node head = null;
        Node tail = null;
        void add(int val){
            Node temp = new Node(val);
            if(size == 0){
                head = tail = temp;
                size++;
                return;
            }
            tail.next = temp;     //Insufficient Logic
            tail = temp;
            size++;
            return;
        }

        void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int poll() throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty");
            }
            int x = head.data;
            head = head.next;                     //Insufficient Logic
            size--;
            return x;
        }

        int peek() throws Exception{
            if(size == 0) throw new Exception("Queue is Empty");
            int x = head.data;
            return x;
        }

        boolean isEmpty(){
            return size == 0;
        }
    }
    public static void main(String[] args) throws Exception {
        llQueue q = new llQueue();
        System.out.println(q.isEmpty());
        q.add(5);
        q.add(6);
        q.add(7);
        System.out.println(q.head.data);
        q.display();
        q.poll();
        System.out.println(q.head.data);
        System.out.println(q.peek());

    }
}
