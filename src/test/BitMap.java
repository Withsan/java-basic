package test;

/**
 * @author Wyl
 * @date 2020-03-16 17:30
 */
public class BitMap {
    /**
     * 可修改，验证自己的答案
     *
     * @param args
     */
    public static void main(String[] args) {
        long a = 1L << 7, b = 4;
        System.out.println(a);
        System.out.println(Long.toBinaryString(a));
        a |= b;
        System.out.println(Long.toBinaryString(a));
        System.out.println(Long.toBinaryString(b));
        System.out.println(a);
        a &=(~b) ;
        System.out.println(a);
        System.out.println(Long.toBinaryString(a));
    }
}
