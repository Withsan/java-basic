package test.juc.mylock.reentrantLock;

/**
 * @author Wyl
 * @date 2020-03-12 14:06
 */
public class ReentrantLock {
    private int state = 0;
    private Thread threadHold;

    /**
     * 获取锁
     */
    public synchronized void lock() throws InterruptedException {
        Thread current = Thread.currentThread();
        while (!(threadHold == null || threadHold == current)) {
            wait();
        }
        threadHold = current;
        state++;
    }

    public synchronized void unlock() {
        if (threadHold == null || state == 0) {
            throw new IllegalStateException("not locked yet");
        }
        if (Thread.currentThread() == threadHold) {
            state--;
            if (state == 0) {
                threadHold = null;
                notify();
            }
        }
    }
}
