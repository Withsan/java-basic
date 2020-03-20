package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Wyl
 * @date 2019-10-29 14:32
 */
public class ListMap {
    public static void main(String[] args) {
        String aae041 = "201801";
        String aae042 = "201205";
        List<Map> list = new ArrayList<>();
        Map one = new HashMap(2);
        one.put("aae041","201901");
        one.put("aae042","201912");
        Map two = new HashMap(2);
        two.put("aae041","201901");
        two.put("aae042","201912");
        list.add(one);
        list.add(two);
        list.get(0).put("aae041",aae041);
        list.get(list.size()-1).put("aae042",aae042);
        System.out.println(list.toString());
    }

}
