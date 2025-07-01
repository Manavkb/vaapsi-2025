package MultiThreadingCode;

class Camera {
    void click()
    {
        System.out.println("Entered -- " + Thread.currentThread().getName());
        synchronized (this)
        {
            for (int click = 1; click < 25; click++)
            {
                System.out.println(Thread.currentThread().getName());
            }
        }
        System.out.println("Exit --- " + Thread.currentThread().getName());
    }
}


class Bachu extends Thread
{
    Camera camera;
    Bachu(Camera camera)
    {
        this.camera = camera;
    }
    @Override
    public  void run()
    {
        camera.click();
    }
}

class NarWani extends Thread
{
    Camera camera;
    NarWani(Camera camera)
    {
        this.camera = camera;
    }
    @Override
    public  void run()
    {
        camera.click();
    }
}


class MainClass
{
    public static void main(String[] args)
    {
        Camera camera = new Camera();
        Bachu th1 =  new Bachu(camera);
        NarWani th2 =  new NarWani(camera);

        th1.setName("Swathi");
        th2.setName("Rashmi");

        th1.start();
        th2.start();

    }
}