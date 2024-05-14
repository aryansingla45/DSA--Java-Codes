package Old;

public class RecursionSearch {
    public static void main(String[] args) {
        int[] arr = {2,1,3,1,4,5,6,5};
        int target = 1;
//        System.out.println(LinearSearch(arr , target , 0));
        IndexLinearSearch(arr , target , 0);
    }
    static boolean LinearSearch(int[] arr ,int target, int idx){
        if(idx == arr.length){
            return false;
        }
        if(arr[idx] == target){
            return true;
        }
        return LinearSearch(arr , target, idx+1);
    }

    static void IndexLinearSearch(int[] arr , int target , int idx){
        if(idx ==  arr.length) return;
        if(arr[idx] == target) System.out.println(idx);
        IndexLinearSearch(arr , target , idx + 1);

    }
}
