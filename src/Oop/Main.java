package Oop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting System");
        Emp e1 = new Emp();
        e1.setEid(101);
        e1.setEname("John");
        e1.setSalary(501.24f);


        Emp e2 = new Emp();
        e2.setEid(98);
        e2.setEname("Johny");
        e2.setSalary(401.24f);

        e1.display();
        e2.display();

        System.out.println(e1);
        System.out.println(e2);
    }
}