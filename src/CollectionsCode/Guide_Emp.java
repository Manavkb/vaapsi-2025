package CollectionsCode;

import java.util.ArrayList;
import java.util.Vector;

public class Guide_Emp
{
    public static void main(String[] args) {
        // ArrayList<String> listOfNames = new ArrayList<>();

        Vector<String> listOfNames = new Vector<>();
        listOfNames.add("John");
        listOfNames.add("Jane");
        listOfNames.add("Julie");
        listOfNames.add("David");

        listOfNames.add("John");
        listOfNames.add("Jane");
        listOfNames.add("Julie");
        listOfNames.add("David");

        listOfNames.add("John");
        listOfNames.add("Jane");
        listOfNames.add("Julie");


        System.out.println(listOfNames.size());
        System.out.println(listOfNames);
        System.out.println(listOfNames.capacity());
        listOfNames.trimToSize();
        System.out.println(listOfNames.capacity());
    }
}
