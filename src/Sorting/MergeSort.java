package Sorting;
import static Sorting.Sorting_1.transverse;
public class MergeSort{
    public static void mergeSort(int[] arr , int l , int r){
        if(l>=r) return;
        int mid = (l+r)/2;
        mergeSort(arr,0,mid);
        mergeSort(arr,mid+1, r);
        merge(arr,l,mid,r);
    }

    public static void merge(int[] arr, int l, int mid, int r){  //O(n)
        //left length
        int left_length = mid - l + 1;
        //right length
        int right_length = r - mid;
        int[] left = new int[left_length];
        int[] right = new int[right_length];
        int i , j ,k;
        for (i = 0; i<left_length; i++){
            left[i] = arr[l+i];
        }
        for (j=0; j<right_length; j++){
            right[j] = arr[mid+1+j];
        }
        i =0;j=0;k=l;
        while (i<left_length && j<right_length){
            if(left[i]<right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }
        while(i<left_length){
            arr[k++] = left[i++];
        }
        while (i<right_length){
            arr[k++] = right[i++];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,2,7,3,9,1,3,2,5,2};
        mergeSort(arr , 0 , arr.length-1);
        transverse(arr);
    }
}
