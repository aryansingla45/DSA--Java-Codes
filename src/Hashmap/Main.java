package Hashmap;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Max Freq in a array using HashMap.

        Map<Integer , Integer> hmap = new HashMap<>();
        int[] arr = {1,2,3,4,1,3,1,3,1,2,4,5,2,4,6};
        for(int el : arr){
            if(!hmap.containsKey(el)){
                hmap.put(el , 1);
            }
            hmap.put(el , hmap.get(el) + 1);
        }
        int maxFreq = 0;
        var ansKey = 0;
        for(var el : hmap.entrySet()){
            if(el.getValue() > maxFreq){
                maxFreq =   el.getValue();
                ansKey = el.getKey();
            }
        }
        for(var key : hmap.keySet()){                //var --> new keyword
            if(hmap.get(key) > maxFreq){
                maxFreq = hmap.get(key);
                ansKey = key;
            }
        }
        System.out.println(hmap.entrySet());
        System.out.println(maxFreq);
        System.out.println(ansKey);
    }

}
