package concurrent.mylock.unreentrantlock;

/**
 * @author Wyl
 * @date 2020-03-12 10:59
 */
public class UnReentrantLock {
    private boolean isLock = false;

    /**
     * 获取锁
     */
    public synchronized void lock() throws InterruptedException {
        //1 判断锁的状态
        if (isLock) {
            System.out.println("wait");
            wait();
        }
        //2 获取锁
        isLock = true;
    }

    public synchronized void unlock() {
        //1 判断锁的状态
        if (!isLock) {
            throw new IllegalStateException("not locked yet");
        } else {
            //2 释放锁
            isLock = false;
            notify();
        }
    }
}
