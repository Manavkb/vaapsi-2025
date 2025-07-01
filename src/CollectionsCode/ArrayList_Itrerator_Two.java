package CollectionsCode;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Itrerator_Two
{
    public static void main(String[] args) {
        ArrayList<Integer> myNumList = new ArrayList<Integer>();

        myNumList.add(1);
        myNumList.add(2);
        myNumList.remove(0);
        myNumList.add(3);
        // myList2.add(3.14);

        // Loop
        for (Integer i : myNumList) {
            System.out.println(i);
        }

        // Using Iterator
        Iterator<Integer> it = myNumList.iterator();

//        while (it.hasNext())
//        {
//            System.out.println(it.next());
//        }

        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
    }
}
