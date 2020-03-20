package test;

public class TestStack {

    public static void hello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        ((TestStack) null).hello();
        String rev = reverseRecursively("woshizhu");
        System.out.println(rev);
    }

    public static String reverseRecursively(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }
}


