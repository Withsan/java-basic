package jvm;

/**
 * 1.类已经被加载的时候
 * new的时候一律不管static字段或者方法或者代码块是否已经初始化
 * 2.类未初始化
 * 按照正常流程，初始化在new对象
 * 3.类的初始化是自上而下的顺序staticTest1和staticTest2的结果不一样就能看出来
 * 4. 类只能初始化一次
 *
 * @author Wyl
 * @date 2019-10-22 15:46
 */
public class StaticTest {
    public static void main(String[] args) {
        // 触发类加载
        staticFunction();
    }

    static StaticTest staticTest1 = new StaticTest();
    /**
     * 实例变量
     */
    int a = 110;
    /**
     * 静态变量
     */
    static int b = 112;

    /**
     * 类初始化的时候会执行
     */
    static {
        System.out.println("Step1");
    }

    /**
     * 实例对象被构造时会执行
     */ {
        System.out.println("Step2");
    }

    StaticTest() {
        System.out.println("Step3");
        System.out.println("a=" + a + ",b=" + b);
    }

    public static void staticFunction() {
        System.out.println("Step4");
    }

    static StaticTest staticTest2 = new StaticTest();
}

