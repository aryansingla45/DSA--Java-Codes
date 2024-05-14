package Recursion;
/*Recursion is all about a base case , out work , and recursive work.*/

public class P1 {
    static void printNumbers(int[] arr , int idx){
        if(idx == arr.length){return;}
        System.out.println(arr[idx]);
        printNumbers(arr , idx+1);
    }

    static boolean isSorted(int[] arr , int startidx){
        if(startidx == arr.length - 1){
            return true;
        }
        return arr[startidx+1] > arr[startidx] && isSorted(arr , startidx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3};

        // Ques: Print all the numbers through recursion
//        printNumbers();
        // Ques : Find an array is sorted or not
        boolean a = isSorted(arr , 0);
        System.out.println(a);

        // Ques : 


    }
}
