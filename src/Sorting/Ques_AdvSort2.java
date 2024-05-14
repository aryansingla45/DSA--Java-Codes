package Sorting;

public class Ques_AdvSort2 {

    static void swapSort(int[] arr){
        int x = -1;
        int y = -1;
        for (int i = 1; i < arr.length; i++){
            if(arr[i-1] > arr[i]){
                if(x==-1){
                    x = i-1;
                    y = i;
                }
                else{
                    y = i;
                }
            }
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void partition(int[] arr){
        int pivot = 0;
        int right = 0;
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < pivot){
                left++;
            }
        }
        right = arr.length - left;
        int[] l = new int[left];
        int[] r = new int[right];
        int lIndex = 0;
        int rIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[lIndex++] < pivot){
                l[i] = arr[i];
            }else {
                r[rIndex++] = arr[i];
            }
        }
        System.arraycopy(l,0,arr,0,left);
        System.arraycopy(r,0,arr,left,right);
    }
    public static void main(String[] args) {
        /*Given a sorted array with a pair of swapped element. You have to sort the array in linear time.*/
        int[] arr = {3,9,6,7,8,5,10};
//        swapSort(arr);

        /*Given an array of positive and negative numbers. The output should print all negative number first
        * and then the positive numbers. in linear time and O(1) space.
        * Input = [-20,5,18,-7,3,-43]
        * Output = [-20 -7 -43 5 18 3]
        * */
        int[] arr2 = {-20,5,18,-7,3,-43};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

    }
}
