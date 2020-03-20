package test;

/**
 * HashMap tableSizeFor方法
 * @author Wyl
 */
public class Reference {
    public static void main(String[] args) {
        int k = tableSizeFor(10);
        System.out.println(k);
    }

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        System.out.println(n);
        n |= n >>> 1;
        System.out.println(n);
        n |= n >>> 2;
        System.out.println(n);
        n |= n >>> 4;
        System.out.println(n);
        n |= n >>> 8;
        System.out.println(n);
        n |= n >>> 16;
        System.out.println(n);
        return n + 1;
    }

}
