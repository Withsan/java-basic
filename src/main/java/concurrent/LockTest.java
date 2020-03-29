package concurrent;

/**
 * @author Wyl
 * @date 2019-11-25 22:52
 */
public class LockTest {


    public static void main(String[] args) {
        ZhiFuBao zhiFuBao = new ZhiFuBao();
        for (int i = 0; i < 100; i++) {
            new Thread(zhiFuBao, "舞东风" + i).start();
        }
    }
}
