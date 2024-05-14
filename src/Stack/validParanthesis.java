package Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class validParanthesis {
    public static boolean balanced(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                st.push(c);
            }

            if(c == ')'){
                if(st.isEmpty()) return false;
                if(st.pop() == '(') continue;
            }
        }
        return st.isEmpty();
    }

    public static int[] removeConsequences(int[] arr){
        Queue<Integer> queue = new LinkedList<>();
        for(int num : arr){
            if (queue.isEmpty() || queue.peek() != num){
                queue.offer(num);
            }
        }
        int[] res = new int[queue.size()];
        for (int i = 0; i < res.length; i++){
            res[i] = queue.poll();
        }
        return res;
    }

    public static int[] nextGreater(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];
        int lastidx = arr.length - 1;
        for (int i = lastidx - 1; i >= 0; i--){
            while (stack.peek() < arr[i] && stack.size() > 0){
                stack.pop();
            }
            if (stack.size() == 0){
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        String s = ")((())";
        int[] arr = {1,5,3,2,1,6,3,4};
        int[] res = nextGreater(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}