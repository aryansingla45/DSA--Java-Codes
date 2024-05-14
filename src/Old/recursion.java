package Old;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
//        int q = sc.nextInt();
//        int ans = power(p,q);
        System.out.println(CountNumbers(p));
/*
        PrintNumbers(n);
        print(n);
*/
//        System.out.println(SumNumbers(n));
//        System.out.println(power(p,q));
    }

    static void PrintNumbers(int n ){
        if(n==1){
            System.out.println(1);
            return;
        }
        PrintNumbers(n-1);
        System.out.print(n + " ");
    }

    static void print(int n ){
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    static int SumNumbers(int n){
        if(n<= 9 && n >=0) return n;
        return SumNumbers(n/10) + n%10;
    }

    static int power(int p , int q ){
        if(q == 0) return 1;
        return power(p , q-1) * p;
    }


    static int CountNumbers(int n){
        if(n>=0 && n <=9){
            return 1;
        }
        return CountNumbers(n/10) + 1;
    }




}



