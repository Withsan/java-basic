package test;

import java.util.HashMap;

public class Equals {
        private static int MyObject;
        public static void setA(int a){
                a = a;
        }
	public static void main(String args []) throws Exception {
            HashMap map1 = new HashMap(4);
            HashMap map2 = new HashMap(4);
        map1.put("aae041","201901");
        map1.put("aae042","201911");
        map2.put("aae041","201901");
        map2.put("aae042","201911");
        System.out.println(map1.hashCode());
        System.out.println(map2.hashCode());
        System.out.println(map2.equals(map1));

    }
}
