package Sorting;

public class Sorting_1 {
    public static void bubbleSort(int[] arr){
        int temp = 0;
        /*Start a loop that transverse whole array*/
        for (int i = 0; i < arr.length - 1; i++){
            boolean flag = false;
            /*Find the next adjacent element in the array then swap.*/
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
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

    public static void insertSort(int[] arr){
        // Start a loop from 1 to n where arr[0] is considered as sorted.
        for (int i = 1; i <= arr.length - 1; i++) {
            int j = i;
            while(j >= 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void selectSort(int[] arr){
        // Select an element from the array
        for (int i = 0; i < arr.length; i++) {
            // Set the selected element as the minimum index
            int minIndex = i;
            // Search that this selected element is smallest in the unsorted array or not
            for (int j = i; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
                /* if the element is not at the minimum place then you swap the element in the unsorted part
                of the array */
                if(minIndex != i){
                    int temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
        }
    }

    public static void transverse(int[] arr){
        for(int element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,7,5,9,3};
        insertSort(arr);
        transverse(arr);
        int[] arr2 = {1,4,2,7,5,9,3};
        bubbleSort(arr2);
        transverse(arr2);
        int[] arr3 = {1,4,2,7,5,9,3};
        selectSort(arr3);
        transverse(arr3);
    }
}