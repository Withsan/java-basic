package test.juc;


import test.juc.mylock.reentrantLock.ReentrantLock;

/**
 * @author Wyl
 * @date 2020-03-12 11:15
 */
public class ZhiFuBao implements Runnable {
    private static ReentrantLock lock = new ReentrantLock();
    private int yue = 100;

    @Override
    public void run() {

        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "得到了锁");
            if (yue > 0) {
                yue--;
            }
            System.out.println("剩余" + yue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
