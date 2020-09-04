package concurrent;

import java.time.LocalTime;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceTest {
    static ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(2);

    public static void main(String[] args) {
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("scheduleAtFixedRate" + LocalTime.now());
        }, 1, 3, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(() -> {
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("scheduleWithFixedDelay" + LocalTime.now());
        }, 1, 3, TimeUnit.SECONDS);
    }
}


