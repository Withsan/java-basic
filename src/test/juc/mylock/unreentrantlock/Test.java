package test.juc.mylock.unreentrantlock;

/**
 * @author Wyl
 * @date 2020-03-12 11:13
 */
public class Test {
    public static void main(String[] args) {
        UnReentrantLock unReentrantLock = new UnReentrantLock();
        methodA(unReentrantLock);

    }
    public static void methodA(UnReentrantLock unReentrantLock){
        try {
            unReentrantLock.lock();
            methodB(unReentrantLock);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            unReentrantLock.unlock();
        }

    }
    public static void methodB(UnReentrantLock unReentrantLock){try {
        unReentrantLock.lock();
    } catch (InterruptedException e) {
        e.printStackTrace();
    } finally {
        unReentrantLock.unlock();
    }

    }
}
