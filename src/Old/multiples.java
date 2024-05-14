package Old;

import java.util.Scanner;

public class multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Print(n,k);
    }

    static void Print(int n , int k){
        if(k == 1){
            System.out.println(n);
            return;
        }
        Print(n , k-1);
        System.out.println(n*k);
    }


}
