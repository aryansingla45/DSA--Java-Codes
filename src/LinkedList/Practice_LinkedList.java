package LinkedList;
public class Practice_LinkedList {
    public static class Node{
        int data;
        Node next;
        //Constructor
        Node(int data){
            this.data = data;
        }
    }

    public static class Linked_List{
        Node head;
        Node tail;
        int size;

        void Display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void InsertAtStart(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void InsertAtLast(int val){
            Node temp = new Node(val);
            if(tail == null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void InsertAtIndex(int val , int idx){
            if(idx > size || idx < 0) return;
            Node current = head;
            Node temp = new Node(val);
            if(idx == 0){
                temp.next = head;
                head = temp;
                size++;
                if(size == 1){
                    tail = temp;
                }
                return;
            }
            for (int i = 0; i < idx - 1; i++) {
                current = current.next;
            }
            temp.next = current.next;
            current.next = temp;
            if(idx == size){
                tail = temp;
            }
            size++;
        }

        void DeleteAtStart(){
            head = head.next;
            size--;
        }
        void DeleteAtLast(){
            if(size <= 1){
                head = tail = null;
                size = 0;
                return;
            }

            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            tail = current;
            tail.next = null;
            size--;
        }
        void DeleteAtIndex(int idx){
            Node Current = head;

            if (idx == 0) {
                head = head.next;
                size--;
                if (size == 0) {
                    tail = null; // Update tail if the list becomes empty after deletion
                }
                return;
            }

            for (int i = 1; i <= idx-1; i++) {
                Current = Current.next;
            }
            Current.next = Current.next.next;

            if (idx == size - 1) {
                tail = Current; // Update tail if deleting the last node
            }
            size--;
        }

        void Search(int val){
            Node temp = head;
            for (int i = 0; i < size; i++) {
                if(temp.data == val){
                    System.out.println("Value found");
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Value Not Found");
        }

        void getElement(int idx){
            if(idx < 0 || idx >=size){
                System.out.println("Invalid");
                return;
            }
            Node temp = head;

            for (int i = 0; i <idx ; i++) {
                temp = temp.next;
            }
            System.out.println(temp.data);
        }

    }
    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.InsertAtStart(1);
        ll.InsertAtStart(0);
        ll.InsertAtIndex(2,2);
        ll.InsertAtIndex(3,3);
        ll.InsertAtIndex(4,4);
        ll.InsertAtLast(5);
        ll.InsertAtLast(6);
        ll.Display();
        ll.DeleteAtIndex(2);
        ll.DeleteAtIndex(3);
        ll.DeleteAtStart();
        ll.DeleteAtLast();
        ll.Display();
        System.out.println(ll.size);
        ll.Search(4);
        ll.Search(8);
        ll.Display();
        ll.getElement(3);
    }
}