package concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author Wyl
 * @date 2019-11-25 13:20
 */
public class ContDownLatchTest {
    private static CountDownLatch count = new CountDownLatch(10);

    public static void main(String[] args) throws InterruptedException {
        Calthread calthread = new Calthread();
        calthread.setCount(count);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(calthread);
            thread.start();
        }
        System.out.println("'");
        // 阻塞主线程直到CountDownLatch为0
        count.await();
        long end = System.currentTimeMillis();
        System.err.println(end - start);
    }
}

class Calthread implements Runnable {
    CountDownLatch count;

    public void setCount(CountDownLatch count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count.countDown();
    }
}