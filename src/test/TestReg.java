package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestReg {

	public static void main(String[] args) {
		String num="19680806519";
System.out.println(checkPhoneNum(num));
	}
	private static boolean checkPhoneNum(String aae005){
		String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}$";
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(aae005);
		return matcher.matches();
	}
}
