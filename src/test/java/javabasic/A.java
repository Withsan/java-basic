package javabasic;

import org.junit.Test;

public class A {
    @Test
    public void a() {
        int a = 0, b = 0, c = 0;
        a |= 1 << 2;
        a |= 1 << 4;
        System.out.println(Integer.toBinaryString(a));
        b = 1 << 3;
        System.out.println(Integer.toBinaryString(b));
        a &= b;
        System.out.println(Integer.toBinaryString(a));
    }
}
