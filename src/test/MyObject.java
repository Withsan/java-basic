package test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Wyl
 * @date 2020-03-11 16:00
 */
public class MyObject {
    Map<String,String> myMap = new HashMap();
    public String get(String s){
        return myMap.get(s);
    }
    public void set(String k,String v){
        myMap.put(k,v);
    }
}
