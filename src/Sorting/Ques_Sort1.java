package Sorting;
import static Sorting.Sorting_1.transverse;

public class Ques_Sort1 {
    private static void moveZeroToEnd(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if(arr[j] == 0 && arr[j+1] != 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    private static void lexicographicalString(String[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }
                String temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    private static void sortByLength(String[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minLen = arr[i].length();
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j].length() < minLen){
                    minLen = arr[j].length();
                    minIndex = j;
                }
            }
            if(minIndex != i){
                String temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        /*Given an integer array, move all 0's to the end of it while maintaining the relative order
         of the non-zero element.
         Note : Do not make a copy of the array.
         Input = [0,5,0,3,42] Output = [5,3,42,0,0].          */
        int[] arr = {0,5,0,3,42};
        moveZeroToEnd(arr);

        /*Given an array of names of fruits. You have to sort it in lexicographical order using the
        * Selection Sort.
        * Input = ["papaya" , "lime" , "watermelon" , "apple" , "mango" , "kiwi"]
        * Output = {"apple" , "kiwi" , "lime" , "mango" , "papaya" , "watermelon"}. */
        String[] array = {"papaya" , "lime" , "watermelon" , "apple" , "mango" , "kiwi"};
        lexicographicalString(array);

        /*Write a Java function named sortByLength that takes an array of strings as
         input and sorts the strings based on their lengths using the selection sort algorithm.
         Test your function with a sample array of strings and print the sorted array.
         */
        String[] array1 = {"papaya" , "lime" , "watermelon" , "apple" , "mango" , "kwi"};
        sortByLength(array1);
        transverseString(array1);
    }

    private static void transverseString(String[] array1) {
        int i = 0;
        for(String s: array1){
            System.out.print(array1[i]+ " ");
            i++;
        }
        System.out.println();
    }
}