package Old;

import java.util.Scanner;
//import My_Algo.Sorting.Sorting;


public class Java_Basics {

    public static void main(String[] args) {
//        System.out.println("Hello");

        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = 6;
//        int c = a + b;
//        System.out.println(c);

//        Sorting.Sorting sort = new Sorting.Sorting();
//        sort.InsertionSort();
//        int ans = average(25,45,65);
//        System.out.println(ans);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        GCD(n1 , n2);
    }

    public static int average(int a , int b , int c){
        int sum = a + b + c;
        int avg = sum / 3;
        return avg;
    }

    static void GCD(int n1, int n2) {
        int max = Math.max(n1, n2);
        System.out.println(max);
        for (int i = 1; i < max; i++) {
            if(n1%i == 0 && n2%i == 0){
                System.out.println(i);
            }
        }
    }
}