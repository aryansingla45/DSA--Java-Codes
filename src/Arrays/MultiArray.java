package Arrays;

public class MultiArray {
    public static void main(String[] args) {
        int[][] MultiArray = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                MultiArray[i][j] = i + j + 1;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(MultiArray[i][j]);
            }

        }
    }
}
