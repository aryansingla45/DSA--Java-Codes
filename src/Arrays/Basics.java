package Arrays;

import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {

        //Declaration
        int[] arr = {1,2,3,4,5};
        int size=1;
        int[] arr2 = new int[size];

        //Creation
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 100;
        array[2] = 10;
        System.out.println(array[1]);

        //Input using loops
        int n=5;
        int[] array2 = new int[n];
        for (int i = 0; i < n; i++) {
            array2[i] = i+1;
        }

        //using scanner class

        //Output using loops
        for (int i = 0; i < n; i++) {
            System.out.println(array2[i]);
        }

        //Operation
        System.out.println(array.length);
        System.out.println(Arrays.stream(array).max().getAsInt());



    }
}
