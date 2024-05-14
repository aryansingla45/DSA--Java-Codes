package ArrayList;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        // adding element
        l.add(5);
        l.add(6);
        l.add(7);
        //printing
        System.out.println(l);
        // print a particular index
        System.out.println(l.get(2));
        // modify list -- adding element
        l.add(2,100);
        System.out.println(l.get(2));
        //size
        System.out.println(l.size());

        //modify at idx
        l.set(1,89);
        // remove
        l.remove(2); //idx
        l.remove(Integer.valueOf(89)); // element
        //boolean
        Boolean x = l.contains(Integer.valueOf(89));
        System.out.println(x);

    }
}
