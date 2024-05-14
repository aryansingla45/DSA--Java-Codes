package Sorting;
import java.util.Arrays;

import static Sorting.CountSort.*;

public class RadixSort {
    static void radixSort(int[] arr){
        int max = findMax(arr);
        for (int place = 1; max/place > 0; place = place * 10){
            cs(arr , place);
        }
    }
    static void cs(int[] arr, int place){
        int[] output = new int[arr.length];
        int[] freq = new int[10];

        for (int i = 0; i < arr.length; i++) {
            freq[(arr[i]/place)%10]++;
        }
        for (int i = 1; i < freq.length; i++){
            freq[i] += freq[i-1];
        }
        for (int i = arr.length-1; i >= 0; i--) {
            int idx = freq[(arr[i] / place) % 10] - 1;
            output[idx] = arr[i];
            freq[(arr[i]/place) % 10]--;
        }
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {2 , 45 , 560,462,905,90};
        radixSort(arr);
        transverse(arr);
    }


}
