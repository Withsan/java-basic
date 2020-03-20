package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        Iterator<String> i = list.iterator();
        int q = 0;
        while (i.hasNext()) {
            q++;
            i.next();//不调用next 则无法调用remove方法
            if (q == 3) {
                i.remove();
                System.out.println(list.size());
			}
            }
		System.out.println("还有下面这种方式");
		int j = 1;
		int m;
		System.out.println(m=j);
        }
    }
