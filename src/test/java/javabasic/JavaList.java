package javabasic;

import org.junit.Test;

/**
 * @author wyl
 */
public class JavaList {
    @Test
    public void remove() {
        int [] src = new int[10];
        for (int i = 0; i <src.length ; i++) {
            src[i]=i;
            System.out.print(i+","+src[i]+";   ");
        }
        System.out.println("");
        int index = 7;
        int mvn = src.length - index-1;
        int last = src.length-1;
        System.arraycopy(src,index+1,src,index,mvn);
        src[last] = 0;
        for (int i = 0; i <src.length ; i++) {
            System.out.print(i+","+src[i]+";   ");
        }
    }

}
