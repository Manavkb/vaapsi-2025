package Oop;

class ParentOne
{
    ParentOne() {
        System.out.println("Oop.ParentOne Constructor");
    }

    String surName()
    {
        return "Oop.ParentOne sname";
    }

    String bg = "O+";

    ParentOne(String city)
    {
        this();
        System.out.println("Oop.ParentOne   -- " +  city);
    }
}

class ChildOne extends ParentOne
{
    // super();
    ChildOne() {
        super("Pune");
        System.out.println("Oop.ChildOne Constructor");
    }

    void accessParentProps()
    {
        System.out.println(super.surName());
        System.out.println(super.bg);
    }
}
public class superCode {
    public static void main(String[] args) {
        ChildOne obj = new ChildOne();
        obj.accessParentProps();

        System.out.println(obj.bg);
        System.out.println(obj.surName());
    }
}
