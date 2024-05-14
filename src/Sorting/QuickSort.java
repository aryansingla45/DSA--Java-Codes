package Sorting;

import static Sorting.Sorting_1.transverse;

public class QuickSort {
    private static void swap(int[] arr , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void quicksort(int[] arr ,int st ,int end){
        if(st>=end) return;
        int pi = partition(arr,st,end);
        quicksort(arr , st , pi-1);
        quicksort(arr , pi+1 , end);
    }
    public static int partition(int[] arr , int st , int end){
        int pivot = arr[st];
        int count = 0;
        for (int i = st+1; i <=end; i++) {
            if(arr[i] < pivot) count++;
        }
        int pvtIdx = st + count;
        swap(arr,st,pvtIdx);
        /*From here the pivot index is at its correct place, and he has to only sort its left and right
        * part now.*/
        int i = st , j = end;
        while(i<pvtIdx && j>pvtIdx){
            while(arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;
            if(i<pvtIdx && j>pvtIdx){
                swap(arr , i , j);
                i++;
                j--;
            }
        }
        return pvtIdx;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,3,7,2,9,10,7,4,3};
        quicksort(arr,0,arr.length-1);
        transverse(arr);
    }
}
