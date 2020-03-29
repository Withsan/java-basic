package concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * @author Wyl
 * @date 2019-12-12 14:33
 */
public class CyclicBarrierTest {
    static CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
    /**
     * 到达屏障的时候会优先执行{@linkplain B#run()}.
     */
    static CyclicBarrier cyclicBarrier2 = new CyclicBarrier(2,new B());



    public static void main(String[] args) throws InterruptedException {

        Thread thread_a = new Thread(() -> {
            try {
                // 一下都表示线程 A到达屏障点
                cyclicBarrier.await();
                cyclicBarrier2.await();
                System.out.println(1+ Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        });
        thread_a.start();
        TimeUnit.SECONDS.sleep(2);
        try {
            // 一下都表示主线程到达屏障点
            cyclicBarrier.await();
            cyclicBarrier2.await();
            System.out.println(2+ Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
    static class B implements Runnable {
        @Override
        public void run() {
            System.out.println("A"+ Thread.currentThread().getName());
        }
    }
}
