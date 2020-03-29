package concurrent.deadlock;

import java.util.concurrent.TimeUnit;

public class DeadLockDemo2 {
    public  void methodAA(TestLock testLockA,TestLock testLockB)  {
        testLockB.methodA(testLockA);
    }


    public static void main(String[] args) {
        TestLock testLockA = new TestLock();
        TestLock testLockB = new TestLock();
        DeadLockDemo2 deadLockDemo = new DeadLockDemo2();
        new Thread(() -> deadLockDemo.methodAA(testLockA,testLockB)).start();
        new Thread(() -> deadLockDemo.methodAA(testLockB,testLockA)).start();
    }
}
class TestLock{
    public synchronized void methodA(TestLock testLock)  {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        testLock.methodB();
    }
    public synchronized  void methodB()  {
    }
}