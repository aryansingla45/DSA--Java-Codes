package Arrays;

import java.util.Scanner;

public class Sessional1 {
    public static void main(String[] args) {
        // Insertion by User
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter your element at idx " + i + " = ");
            arr[i] = sc.nextInt();
        }


        // Transverse and display
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

        //Insertion Manual Input
        int[] array = {1,2,3,4,5};

        int insertAtidx = 3;
        int n = array.length;
        for (int i = insertAtidx + 1; i < n+1; i++) {
            System.out.println("Enter new element at idx ," + insertAtidx);
            array[insertAtidx] = sc.nextInt();
            array[i] = array[i+1];

        }

        // Searching
        int key = 3;
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                idx = i;
            }

        }

        // Deletion / Updation
        for (int i = idx; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        System.out.println();

        // Deletion type 2

//        array[idx] = 0;

        // Printing
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
