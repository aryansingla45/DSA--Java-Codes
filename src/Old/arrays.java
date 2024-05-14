package Old;

import java.util.*;
public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {2,4,6,4,1,5,3};
        System.out.println(Arrays.stream(array).sorted());
    }
    public static void ReverseArray(int[] arr , int n){
        int temp = 0;
        int i = 0;
        int j = n-1;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static int Pairs(int[] arr){
        int pair = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                pair++;
            }
        }
        return pair;
    }

    public static int PairsSum(int[] arr , int target){
        int pair = 0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    pair++;
                }
            }

        }
        return pair;
    }

    public static int SecondMax(int[] arr){
        int max = 0;
        int smax = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        for (int j : arr) {
            if (j != max) {
                if (j > smax) {
                    smax = j;
                }
            }
        }
        return smax;
    }
}
