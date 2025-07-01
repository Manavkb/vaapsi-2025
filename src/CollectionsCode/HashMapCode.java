package CollectionsCode;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapCode
{
    public static void main(String[] args) {
        HashMap<Integer, String> votingList=  new HashMap<Integer, String>();
        votingList.put(1, "A");
        votingList.put(2, "B");
        votingList.put(3, "C");
        votingList.put(4, "D");

        System.out.println(votingList);

       Iterator<Integer> itr =  votingList.keySet().iterator();

       while (itr.hasNext())
       {
           Integer key = itr.next();
           // System.out.println(key);
           String value = votingList.get(key);
           System.out.println("Key: " + key + " Value: " + value);
       }
    }
}
