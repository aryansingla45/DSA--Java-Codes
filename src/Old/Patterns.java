package Old;

public class Patterns {
    public static void main(String[] args) {
        diamond(3);
    }

    static void solidRectangle(int row , int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void hollowRectangle(int row , int col){
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= col; j++) {
                if(i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    static void halfPyramid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j<=i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void invertedHalfPyramid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i<=j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void Pyramid(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i -1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i  + 1 ; j++) {
                System.out.print("*");
            }
//            for (int j = 0; j < n - i -1 ; j++) {
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }


    static void invertedPyramid(int n ){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*n - 2*i - 1; j++){
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void diamond(int n){
        Pyramid(n);
        invertedPyramid(n);
    }


}
