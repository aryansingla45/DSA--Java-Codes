package Old;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int ans = GCD(n1,n2);
        System.out.println(ans);
    }
    public static int BruteForceGCD(int n1 , int n2){
        int min = Math.min(n1,n2);
        int gcd = 1;
        for (int i = 2; i < min; i++) {
            if(n1 % i == 0 && n2%i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    static int GCD(int n1 , int n2){
        if (n2 == 0) return n1;
        return GCD(n2 , n1%n2);
    }



}
