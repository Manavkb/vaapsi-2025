package Oop;

// Entity class
class Emp
{
    // properties
    // class variables -> static , instance
    private int eid;
    private float salary;
    private String ename;

    Emp()
    {
        System.out.println("Creating Oop.Emp");
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        if (eid > 100)
        {
            this.eid = eid;
        }

    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    void display()
    {
        System.out.println("Employee ID: " + this.eid);
        System.out.println("Salary: " + this.salary);
        System.out.println("Name: " + this.ename);
    }

    @Override
    public String toString() {
        return "Oop.Emp{" +
                "eid=" + eid +
                ", salary=" + salary +
                ", ename='" + ename + '\'' +
                '}';
    }
}
