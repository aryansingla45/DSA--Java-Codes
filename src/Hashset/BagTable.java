package Hashset;
import java.util.HashSet;
public class BagTable {
    /*you are provided with a bag which contains pairs of number. you have to take out different numbers
    from the bag and put them on the table. if you find the other pair of the number which is on the
     table then you may delete both the number. you have to find out how many maximum number are present
     on the table at a time.*/
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,3};                   // bag
        HashSet<Integer> hs = new HashSet<>();// table
        int counter = 0;
        for(int ele : arr){
            if(!hs.contains(ele)){
                hs.add(ele);
                counter = Math.max(counter , hs.size());
            }else{
                hs.remove(ele);
            }
        }
        System.out.println(counter);
    }
}