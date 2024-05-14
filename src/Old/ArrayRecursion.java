package Old;

import java.util.Arrays;

public class ArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(PrintMax(arr , 0));
        System.out.println(SumOfArray(arr , 0));
    }

    static int PrintMax(int[] arr , int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }
        int ans = PrintMax(arr , idx + 1);
        return Math.max(arr[idx] , ans);
    }


    static int SumOfArray(int[] arr , int idx){
        if(idx == arr.length){
            return 0;
        }
        int ans = SumOfArray(arr , idx + 1);
        return ans + arr[idx];
    }


}

