package CollectionsCode;

import java.util.ArrayList;
import java.util.Collections;

class Emp implements Comparable<Emp>
{
    int id;
    String name;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Emp o1) {
        return this.id - o1.id;
    }
}

public class GuideEmpSorting
{
    public static void main(String[] args) {
       ArrayList<Emp> empList = new ArrayList<Emp>();
       empList.add(new Emp(10, "Alex"));
       empList.add(new Emp(2, "Bob"));
       empList.add(new Emp(30, "Carl"));
       empList.add(new Emp(4, "David"));

        System.out.println(empList);

        Collections.sort(empList);
        System.out.println(empList);
    }
}











