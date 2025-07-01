package ExcpetionHandling;

interface Car
{
    void engine();
}

public class MyMainClass
{
    public static void main(String[] args) {
        Car car = new Car() {
            @Override
            public void engine() {
                System.out.println("Engine called");
            }
        };
        car.engine();
    }
}
