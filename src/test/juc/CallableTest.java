package test.juc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @author Wyl
 * @date 2019-11-25 14:44
 */
public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableSub callableSub = new CallableSub();
        FutureTask<String> futureTask = new FutureTask(callableSub);
        Thread thread = new Thread(futureTask);
        thread.start();
        // 会产生阻塞直到返回结果
        String result = futureTask.get();
        System.out.println(result);
    }
}
class CallableSub implements Callable<String>{

    @Override
    public String call() throws Exception {
        TimeUnit.SECONDS.sleep(2L);
        return "CallableSub";
    }
}