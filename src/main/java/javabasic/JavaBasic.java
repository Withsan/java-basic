package javabasic;


import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.util.List;

/**
 * java 基础测试
 *
 * @author wyl
 */
public class JavaBasic {
    /**
     * 使用加减交换
     *
     * @param a
     * @param b
     */
    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("a = %d , b = %d", a, b);
    }

    /**
     * 使用异或交换
     *
     * @param a
     * @param b
     */
    public static void swap2(int a, int b) {
        a = a ^ b;
        System.out.println(a);
        b = b ^ a;
        System.out.println(b);
        a = a ^ b;
        System.out.printf("a = %d , b = %d", a, b);
    }

    /**
     * 测试i++；
     *
     * @param a
     * @return
     */
    public static int testPlus(int a) {
        return a++;
    }

    /**
     * 测试++i；
     *
     * @param a
     * @return
     */
    public static int testPlus2(int a) {
        return ++a;
    }

    /**
     * 文件拷贝
     * 测试try with resource
     *
     * @param source
     * @param target
     */
    public static void copyFile(String source, String target) {
        try (FileInputStream fis = new FileInputStream(source);
             BufferedInputStream bis = new BufferedInputStream(fis);
             FileOutputStream fos = new FileOutputStream(target);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            int size = 1024;
            byte[] buff = new byte[size];
            while ((size = bis.read(buff)) != -1) {
                bos.write(buff, 0, size);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 文件拷贝
     * 测试java nio
     *
     * @param source
     * @param target
     */
    public static void copyFile2(String source, String target) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(target);
             FileChannel inputChannel = fis.getChannel();
             FileChannel outputChannel = fos.getChannel()
        ) {
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 文件拷贝
     * 测试Files
     *
     * @param source
     * @param target
     */
    public static void copyFile3(String source, String target) {
        File sourceFile = new File(source);
        File targetFile = new File(target);
        try  {
           Files.copy(sourceFile.toPath(),targetFile.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * catch 会缓存最终return值
     * @return
     */
    public static int testTryCatchReturn(){
        int b;
        try {
             b = 3/0;
        } catch (Exception e) {
           b = 4;
           return b;
        } finally {
            b = 5;
            System.out.println("testTryCatchReturn 最终b="+b);
        }

        return b;
    }
    /**
     * 返回 finally return 值
     * @return
     */
    public static int testTryCatchReturn2(){
        int b;
        try {
            b = 3/0;
        } catch (Exception e) {
            b = 4;
            return b;
        } finally {
            b = 5;
            System.out.println("testTryCatchReturn2 最终b="+b);
            return b;
        }
    }
    /**
     * 递归查找目录下所有文件或目录路径
     * @return
     */
    public static void recursionOfFilePath(String path, List<String> filePathList){
       var pathOfFile = new File(path);
       var fileArray = pathOfFile.listFiles();
       for(var file:fileArray){
           if(file.isDirectory()){
               filePathList.add(file.getPath());
               recursionOfFilePath(file.getPath(),filePathList);
           }else {
               filePathList.add(file.getPath());
           }
       }
    }
}
