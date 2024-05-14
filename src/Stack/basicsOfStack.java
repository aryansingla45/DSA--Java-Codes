package Stack;

import java.util.Stack;

public class basicsOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> temp = new Stack<>();


        st.push(7);
        st.push(8);
        st.push(9);
        st.push(10);
        System.out.println(st);
//        System.out.println(st.peek());
//        System.out.println(st.size());
        while(st.size() >0){           // Put in Temp
            temp.push(st.pop());
        }
        System.out.println(temp);
        while(temp.size() >0){        // Put in another stack to make a copy
            st1.push(temp.pop());
        }
        System.out.println(st1);

    }
}
