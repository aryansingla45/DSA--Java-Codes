package Stack;

public class LinkedListImplement {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class LLStack{
        private Node top;
        private int idx;
        void push(int data){
            Node temp = new Node(data);
            temp.next = top;
            top = temp;
            idx++;
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Empty Stack");
                return -1;
            }
            int temp = top.data;
            top = top.next;
            idx--;
            return temp;
        }
        int peek(){
            if(isEmpty()) {
                System.out.println("Empty Stack");
                return -1;
            }
            return top.data;
        }
        int getSize(){
            return idx;
        }
        boolean isEmpty(){
            return idx==0;
        }
        void display(){
            Node temp = top;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(5);
        st.push(6);
        st.display();
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.getSize());
        System.out.println(st.isEmpty());
    }
}