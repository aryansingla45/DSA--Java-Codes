package Hashset;

import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        int[] arr = {1,2,3,4,5,6,2,3,8,6,9,10};
        for(int i : arr){
            hs.add(i);
        }
        System.out.println(hs);
        int maxLength = 0;
        for(int i : hs){
            if(!hs.contains(i-1)) {
                int currLength = 1;
                while (hs.contains(++i)) {
                    currLength++;
                }
                maxLength = Math.max(maxLength,currLength);
            }
        }
        System.out.println(maxLength);

    }
}
