package test;

import java.util.ArrayList;
import java.util.List;

public class Testnull {

	public static void main(String[] args) {
		Object s=null;
		List list=new ArrayList<>();
		list.add(s);
		System.out.println(list);
	}

}
