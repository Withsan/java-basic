package recursion;

/**
 * @author Administrator
 */
public class Recursion {
    public static void main(String args[]) throws Exception {
        hanoi(4, 1, 2, 3);
    }

	/**
	 * 汉诺塔
	 * @param n
	 * @param t1
	 * @param t2
	 * @param t3
	 */
    public static void hanoi(int n, int t1, int t2, int t3)  {
        if (n == 1) {
            System.out.println("从" + t1 + "移到" + t3);
        } else {
            hanoi(n - 1, t1, t3, t2);
            System.out.println("从" + t1 + "移到" + t2);
            hanoi(n - 1, t2, t1, t3);
        }
    }

	/**
	 * 字符串反转
	 * @param str
	 * @return
	 */
    public static String reverseRecursively(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }
}

