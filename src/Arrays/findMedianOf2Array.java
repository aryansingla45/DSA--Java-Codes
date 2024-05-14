package Arrays;

public class findMedianOf2Array {
    //Arrays + binary Search + Divide and Conqurer
    /*Given two sorted arrays nums1 and nums2 of size m and n respectively
     return the median of the two sorted arrays.
     The overall run time complexity should be O(log (m+n)).
     */
    double findMedian(int[] num1 , int[] num2){
        int[] arr = new int[num1.length + num2.length];
        System.arraycopy(num1 , 0 ,arr,0,arr.length);
        System.arraycopy(num2 , 0 ,arr,num1.length,arr.length);
        int val = 0;

        return val;




    }

    public static void main(String[] args) {

    }


}
