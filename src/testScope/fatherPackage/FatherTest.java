package testScope.fatherPackage;

import testScope.sonPackage.Son;

/**
 * @Description
 * @auther Wyl
 * @create 2019-08-31 13:21
 */
public class FatherTest {
    public static void main(String[] args) {
        Father father = new Father();
        father.say("hello");
        Son son =new Son();
        son.say("hello");
    }
}
