package Queues;

import java.util.Stack;

public class ImplementUsingStacks {
    public static class MyQueue{
        private Stack<Integer> st1;
        private Stack<Integer> st2;

        public MyQueue() {
            st1 = new Stack<>();
            st2 = new Stack<>();
        }

        public void push(int x){
            st1.push(x);
        }

        public int pop(){
            if(st2.isEmpty()){
                while(!st1.isEmpty()){
                    st2.push(st1.pop());
                }
            }
            return st2.pop();
        }

        public int peek(){
            if(st2.isEmpty()){
                while (!st1.isEmpty()){
                    st2.push(st1.pop());
                }
            }
            return st2.peek();
        }

        public boolean isEmpty(){
            return st1.isEmpty() && st2.isEmpty();
        }

    }
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(5);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.isEmpty());
    }
}
