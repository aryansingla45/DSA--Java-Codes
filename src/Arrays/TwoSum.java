package Arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        //Find all the pairs whose sum is equal to the number x.

        int[] arr = {1,5,2,7,6,9,4};
        int x = 7;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < (arr.length); j++) {
                if(arr[i] + arr[j] == x){
                    System.out.println("The indices are " + i +"," + j);
                }
            }
        }

        //TC : O(n2)

        //Find the Unique element in array

        int[] array = {1,2,3,4,3,2,1};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] == array[j]){
                    array[i] = -1;
                    array[j] = -1;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] != -1){
                System.out.println("index " + i + " value " + array[i]);
            }
        }
        //Find the 2nd max no in array
        int[] array2 = {1,2,3,4,5,7,8,9,6};
        Arrays.sort(array2);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        System.out.println(array2.length-1);
    }




}
