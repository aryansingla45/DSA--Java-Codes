package Old;

import java.util.*;
public class Sort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,7,5,9,3};
        bubbleSort(arr);
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }
    }

    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1 ; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void optimizedBubbleSort(int[] arr){
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1 ; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
        }
    }

    static void selectionSort(int[] arr){
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                minIndex = i;
            }
        }
        if(minIndex == -1) System.out.println("Sorted");
    }
}
