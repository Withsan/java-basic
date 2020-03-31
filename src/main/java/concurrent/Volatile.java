package concurrent;

import java.util.concurrent.TimeUnit;

/**
 * @author Wyl
 * @date 2019-11-22 15:05
 */
public class Volatile {
    public static void main(String[] args) {
        SubThread sub = new SubThread();
        Thread subThread = new Thread(sub);
        subThread.start();
        while (true) {
            if (sub.flag) {
                System.out.println("上面：" + sub.flag);
                break;
            }
        }
    }
}

class SubThread implements Runnable {
    public volatile boolean flag = false;

    //    public  boolean  flag = false;
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("下面：" + flag);
    }

}