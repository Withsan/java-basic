package test;

import java.util.ArrayList;
import java.util.List;

public class TestLength {

	public static void main(String[] args) {
     List list =new ArrayList();
     list.add("1");
     list.add("2");
     list.add("3");
     System.out.println(list);
     for(int i = list.size()-1; i >= 0; i--) {
			String a = (String) list.get(i);
			 System.out.println(a);
			if("2".equals(a)) {
				list.remove(a);
			}
		}
     System.out.println(list);
	}

}
