package Arrays;

public class Q_Basics {
    public static void main(String[] args) {
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i+1;
        }

        int[] arr = {5,2,3,3,5};

        //Sum of all values of an array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

        //calculate max value in an array
        int max =  0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

        //search the element in array. if found --> index if not --> -1

        int x = 3;
        int index = -1;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                index = i;
                break;
            }
        }
        System.out.println(index);


        //occurance of a particular value x in an array?how many times
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                count +=1;
            }
        }
        System.out.println(count);

        //prev ques ? give indices ?? find the last index.
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        System.out.println(lastIndex);

        //no of element greater than x.
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > x){
                cnt +=1;
            }
        }
        System.out.println(cnt);

        //check if a array is sorted or not.

        boolean sort = true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] > arr[i]){
                sort = false;
                break;
            }
        }
        if(sort){
            System.out.println("sorted");
        }else{
            System.out.println("not sorted");
        }
    }
}
