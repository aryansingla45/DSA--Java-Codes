package Stack;

import java.util.Stack;

public class Ques {

    public static void ReverseArray(int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);


        // Print Stack w in array

        int[] arr = new int[st.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = st.pop();
        }
        ReverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        DisplayReverseRecursion(st);

        DisplayRecursion(st);

        int top = st.pop();
        PushAtBottom(st , top);
        System.out.println(st);
        // Remove from bottom
        RemoveAtBottom(st);
        System.out.println(st);

        // Remove from any index
        int idx = 3;
        RemoveAtIndex(st , idx);
        System.out.println(st);


    }

    private static void RemoveAtIndex(Stack<Integer> st, int idx) {
        if(st.size() == idx + 1){
            st.pop();
            return;
        }
        int temp = st.pop();
        RemoveAtIndex(st , idx);
        st.push(temp);
    }

    // Remove element from Bottom
    private static void RemoveAtBottom(Stack<Integer> st) {
        if(st.size() == 1){
            st.pop();
            return;
        }
        int temp = st.pop();
        RemoveAtBottom(st);
        st.push(temp);
    }

    // Print Stack with recursion
    public static void DisplayRecursion(Stack<Integer> st){
        if(st.size() == 0) return;
        int temp = st.pop();
        DisplayRecursion(st);
        System.out.print(temp + " ");
    }

    // Print Reverse Stack with recursion
    public static void DisplayReverseRecursion(Stack<Integer> st){
        if(st.size() == 0) return;
        int temp = st.pop();
        System.out.print(temp + " ");
        DisplayReverseRecursion(st);
        return;
    }

    // Push at bottom (top element ko last m push krdo aur baki same)
    public static void PushAtBottom(Stack<Integer> st , int top){
        if(st.size() == 0){
            st.push(top);
            return;
        }
        int temp = st.pop();
        PushAtBottom(st , top);
        st.push(temp);
    }


}
