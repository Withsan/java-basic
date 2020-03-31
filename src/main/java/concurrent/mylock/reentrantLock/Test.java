package concurrent.mylock.reentrantLock;


/**
 * @author Wyl
 * @date 2020-03-12 14:28
 */
public class Test {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        methodA(reentrantLock);

    }

    public static void methodA(ReentrantLock reentrantLock) {
        try {
            reentrantLock.lock();
            methodB(reentrantLock);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }

    }

    public static void methodB(ReentrantLock reentrantLock) {
        try {
            reentrantLock.lock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }

    }
}
