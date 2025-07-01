package Oop;

public interface MyCarTemp
{
    public abstract void engine();
    void tyres(int numOfTyres);

    public static final String color = "Red";
    int wheels = 4;

    default void ac()
    {
        System.out.println("ac");
    }

    static void roof()
    {
        System.out.println("roof called");
    }

    private void handle()
    {
        System.out.println("handle called");
    }
}
