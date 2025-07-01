package Oop;

public class MyCarNew implements MyCarTemp
{

    @Override
    public void engine() {
        System.out.println("engine called");
    }

    @Override
    public void tyres(int numOfTyres) {
        System.out.println("tyres called");
    }

    public static void main(String[] args) {
        MyCarNew car = new MyCarNew();
        System.out.println(car.color);
        car.ac();
    }
}
