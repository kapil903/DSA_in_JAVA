
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Add elements
        list.add(9);
        list.add(4);
        list.add(0);
        list.add(6);
        list.add(7);
        list.add(3);
        list.add(1);
        System.out.println(list);
        //Get Elements
        System.out.println(list.get(0));
        //Add element at specified index
        list.add(1, 8);
        System.out.println(list);
        //Set elemnets
        list.set(2, 5);
        System.out.println(list);
        //Delete elements
        list.remove(1);
        System.out.println(list);
        //Size of list
        System.out.println("The number of elements present in the list is: " + list.size());
        //Sorting the list
        Collections.sort(list);
        System.out.println(list);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
