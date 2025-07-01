package Oop;

abstract class CarTemp
{
    String color;

    abstract void engine();
    abstract void tyres(int numOfTyres);

    String breakk()
    {
        return "this is break";
    }

    CarTemp(String color)
    {
        this.color = color;
        System.out.println("Oop.CarTemp Object");
    }

    static void ac()
    {
        System.out.println("ac");
    }

    static String CarCompName = "BMW";

    static class Seats
    {
        static void mySeatType()
        {
            System.out.println("mySeatType is Leath.");
        }
    }
}



public class MyCar extends  CarTemp
{
    MyCar(String color)
    {
        super(color);
    }
    @Override
    void engine() {
        System.out.println("implemented turbo engine");
    }

    @Override
    void tyres(int numOfTyres) {
        System.out.println("implemented turbo tyres");
    }

    public static void main(String[] args) {
       // Oop.CarTemp c1 = new Oop.CarTemp();
        MyCar c = new MyCar("Black");
        c.engine();
        c.tyres(4);
        System.out.println(c.breakk());
        System.out.println(c.color);
        CarTemp.ac();
        CarTemp.Seats.mySeatType();
    }
}

