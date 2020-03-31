package javabasic;

import org.junit.Test;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class TestUnSafe {


    private static Unsafe unsafe = null;
    private static Field getUnsafe = null;

    static {
        try {
            getUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            getUnsafe.setAccessible(true);
            unsafe = (Unsafe) getUnsafe.get(null);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试不成功
     *
     * @throws NoSuchFieldException
     */
    @Test
    public void setUnsafe() throws NoSuchFieldException {
        Data data = new Data();
        data.setId(1L);
        Field id = data.getClass().getDeclaredField("id");
        long l = unsafe.objectFieldOffset(id);
        id.setAccessible(true);
        //比较并交换，比如id的值如果是所期望的值1，那么就替换为2，否则不做处理
        unsafe.compareAndSwapLong(data, 1L, 1L, 2L);
        System.out.println(data.getId());
    }

    class Data {
        long id;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }
    }
}
