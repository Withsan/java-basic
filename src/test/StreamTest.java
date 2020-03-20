package test;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Wyl
 * @date 2019-10-29 21:16
 */
public class StreamTest {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Integer sumOpt = numberList.stream().reduce(new Integer(5),Integer::sum);
        System.err.println(sumOpt);
    }
}
