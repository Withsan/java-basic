package test;

import java.util.HashMap;
import java.util.Map;

public class TestMapRemove {

	public static void main(String[] args) {
               Map map=new HashMap();
               map.put("1", 1);
               map.put("2", 2);
               map.put("3", 3);
               map.remove("2");
               System.out.println(map.toString());
	}

}
