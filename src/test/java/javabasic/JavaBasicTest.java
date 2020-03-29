package javabasic;

import org.junit.Test;

import java.util.ArrayList;

public class JavaBasicTest {

    @Test
    public void swap() {
        JavaBasic.swap(4,5);
    }

    @Test
    public void swap2() {
        JavaBasic.swap2(4,5);
    }

    @Test
    public void testPlus() {
        int b = JavaBasic.testPlus(5);
        System.out.println(b);
    }

    @Test
    public void testPlus2() {
        int b = JavaBasic.testPlus2(5);
        System.out.println(b);
    }

    @Test
    public void copyFile() {
        String path = "C:\\Users\\Administrator\\Desktop\\";
        String source =path+ "A.txt";
        String target =path+ "B.txt";
        JavaBasic.copyFile(source,target);
    }
    @Test
    public void copyFile2() {
        String path = "C:\\Users\\Administrator\\Desktop\\";
        String source =path+ "A.txt";
        String target =path+ "B.txt";
        JavaBasic.copyFile2(source,target);
    }
    @Test
    public void copyFile3() {
        String path = "C:\\Users\\Administrator\\Desktop\\";
        String source =path+ "A.txt";
        String target =path+ "B.txt";
        JavaBasic.copyFile3(source,target);
    }
    @Test
    public void testTryCatchReturn() {
        System.out.println("实际返回："+JavaBasic.testTryCatchReturn());
        System.out.println("实际返回："+JavaBasic.testTryCatchReturn2());
    }
    @Test
    public void recursionOfFilePath() {
        String path = "C:\\Users\\Administrator\\Desktop\\";
        var listOfFilePath = new ArrayList<String>();
        JavaBasic.recursionOfFilePath(path,listOfFilePath);
        listOfFilePath.forEach(System.out::println);
    }
}
