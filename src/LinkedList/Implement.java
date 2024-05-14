package LinkedList;

import java.util.LinkedList;

public class Implement {
    public static class node{
        int data;
        node next;

        node(int data){
            this.data = data;
        }

        public void display(node head){
            while(head != null){
                System.out.print(head.data + " ");
                head = head.next;
            }
        }
    }

    public static class linkedlist{
        node head = null;
        node tail = null;
        int size = 0;

        void Display(){
            while(head != null){
                System.out.print(head.data + " ");
                head = head.next;
            }
        }

        public static void add(int val){
            node n1 = new node(val);
        }

        

        public void InsertAtEnd(int val){
            node temp = new node(val);
            if(head == null) { //if list is empty
                head = temp;
            }else{       // if list is not empty
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        public void InsertAtBegining(int val){
            node temp = new node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                temp.next = head;
                head  = temp;
            }
            size++;

        };

        public void Insert(int idx , int val){
            node temp = new node(val);


        };


    }
    public static void main(String[] args) {

        linkedlist ll = new linkedlist();
        ll.InsertAtEnd(5);
        ll.InsertAtEnd(6);
        ll.InsertAtEnd(7);
        ll.InsertAtBegining(4);
        ll.Display();
//        System.out.println(ll.size);


    }


}
