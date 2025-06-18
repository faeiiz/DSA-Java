
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {

    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set = new HashSet<Integer>();

        //adding elements
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(1);// this wont be added because 1 already exists

        //Search -> Contains
        System.out.println(set.contains(1));//true
        System.out.println(set.contains(6));//false

        //Delete
        set.remove(1);//removes 1
        System.out.println(set.contains(1));//false

        //size of set
        System.out.println(set.size());

        //print set
        System.out.println(set);

        //iterator
        Iterator it = set.iterator();//starting me this points to null
        //2function
        //next function; returns next value of iterator
        //hasNext function returns true or false
//priting the whole set
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}
