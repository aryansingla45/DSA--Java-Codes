package LinkedList;

import java.util.LinkedList;

public class Basics {
    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }

        public void length(Node n1){
            Node temp = n1;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;

            }
            System.out.println(count);
        }


        public void display(Node n1){
            Node temp = n1;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }



    public static void main(String[] args) {

        Node n1 = new Node(5);
        Node n2 = new Node(6);
        Node n3 = new Node(7);
        Node n4 = new Node(8);
        Node n5 = new Node(9);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        //Displaying Linked List
        n1.display(n1);
        System.out.println();
        n1.length(n1);
    }
}