package concurrent;

import java.util.concurrent.*;

/**
 * @author Wyl
 * @date 2019-12-12 14:41
 */
public class SemaphoreTest {
    private static int SEMAPHORE_COUNT = 10;
    /**
     * 限制为10个线程
     */
    static Semaphore semaphore = new Semaphore(SEMAPHORE_COUNT);
    public static void main(String[] args) {
        ExecutorService threadPool = new ThreadPoolExecutor(30,40,300, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>(10));
        int THREAD_COUNT = 30;
        for (int i = 0; i < THREAD_COUNT; i++) {
            threadPool.execute(new MyRunnable(i));
        }
        threadPool.shutdown();
    }
    static class MyRunnable implements Runnable {
        private int name;
        public MyRunnable(int name){
            this.name = name;
        }
        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("executeBy--"+name);
                TimeUnit.SECONDS.sleep(3);
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
