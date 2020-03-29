package concurrent.deadlock;

import java.util.concurrent.TimeUnit;

public class DeadLockDemo {
    private static String locka = "locka";
    private static String lockb = "lockb";
    public  void methodA()  {
        synchronized (locka){
            System.out.println("lockA is locked");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockb){

                System.out.println("lockB is locked");
            }
        }
    }
    public  void methodB()  {

        synchronized (lockb){
            System.out.println("lockB is locked");
            synchronized (locka){
                System.out.println("lockA is locked");
            }
        }
    }

    public static void main(String[] args) {
        DeadLockDemo deadLockDemo = new DeadLockDemo();
        new Thread(() -> deadLockDemo.methodA()).start();
        new Thread(() -> deadLockDemo.methodB()).start();
    }
}
