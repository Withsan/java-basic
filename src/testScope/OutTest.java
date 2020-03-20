package testScope;

import testScope.fatherPackage.Father;
import testScope.sonPackage.Son;

/**
 * @Description
 * @auther Wyl
 * @create 2019-08-31 13:20
 */
public class OutTest {
    public static void main(String[] args) {
        Father father = new Father();
//        father.say("hello");
        Son son =new Son();
//        son.say("hello");
    }
}
