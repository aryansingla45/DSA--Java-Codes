public class Swap {
    public static void main(String[] args) {

    }
    public static void swap(int[] arr , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
