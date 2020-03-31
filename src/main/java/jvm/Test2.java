package jvm;

/**
 * 构造方法调用子类重写方法
 *
 * @author Wyl
 * @date 2020-03-20 15:14
 */
public class Test2 {
    public static void main(String[] args) {
        Bar bar = new Bar();
        System.out.println(bar.getValue());
    }

}

class Foo {
    String i = "Foo";

    Foo() {
        System.out.println(i);
        //调用子类的getValue方法，此时子类并没有初始化完成导致x为null
        String x = getValue();
        System.out.println(x);
    }

    {
        System.out.println("我是父类普通代码块");
        i = "FooStatic";
    }

    public String getValue() {
        return i;
    }
}

/**
 * 子类
 */
class Bar extends Foo {
    String j = "Bar";

    Bar() {
        j = "BarCon";
    }

    {
        System.out.println("我是子类普通代码块");
        j = "BarStatic";
    }

    @Override
    public String getValue() {
        return j;
    }
}