package concurrent;


import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Wyl
 * @date 2020-03-12 11:15
 */
public class ZhiFuBao implements Runnable {
    private static ReentrantLock lock = new ReentrantLock();
    private int yue = 100;

    @Override
    public void run() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "得到了锁");
            if (yue > 0) {
                yue--;
            }
            System.out.println("剩余" + yue);
        } finally {
            lock.unlock();
        }

    }
}
