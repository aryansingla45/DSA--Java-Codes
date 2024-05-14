package Sorting;

public class CountSort {
    static void transverse(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] freqArray(int[] arr){
        int[] freq = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            freq[val]++;
        }
        System.out.println("The freq. array is ");
        transverse(freq);
        return freq;
    }
    public static void CountSort(int[] arr ){
        int[] freq = freqArray(arr);
        int idx = 0;
        for (int i = 0; i < freq.length; i++) {
            while(freq[i] > 0){
                arr[idx++] = i;
                freq[i]--;
            }
        }
        System.out.println("The array after sorting is");
        transverse(arr);
    }

    //Manvi ma'am

    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static void cSortMT(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr);
        int[] count = new int[max+1];
        //Make frequency array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // Make prefix sum array of output array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }
        // find index of each element in original array and put in output array
        for (int i = n-1; i > 0; i--) {
            int idx = count[arr[i]] - 1;
            output[idx ] = arr[i];
            count[arr[i]]--;
        }
        //Copy all element from output to array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }


    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,1,2,2,4};

    }
}