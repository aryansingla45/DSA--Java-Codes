package Stack;
public class ArrayImplement {
    public static class Stack{
        int capacity = 5;
        int[] arr = new int[capacity];
        int idx = 0;
        void push(int val){
            if(idx + 1> capacity){
                System.out.println("Stack Overflow");
                return;
            }
            arr[idx] = val;
            idx++;
        }
        int pop(){
            if(size() ==0){
                System.out.println("Stack Underflow // Stack is Empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        int peek(){
            if(size() == 0){
                System.out.println("Empty Stack // []");
                return -1;
            }
            return arr[idx - 1];
        }
        void display(){
            for (int i = 0; i < size(); i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty() {
            if(size() == 0) return true;
            else return false;
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
    }
}