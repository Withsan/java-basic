package test.entendsandsuper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wyl
 * @date 2019-09-19 20:15
 */
public class TestExtendsAndSuper {
    public static void main(String[] args) {
        List<Fruit> fruitList = new ArrayList<>();
        List<Food> foodList = new ArrayList<>();
        List<Apple> appleList = new ArrayList<>();
        // 赋值的时候泛型遵守extends和super规则
        mExtendsCollection(appleList);
        mSuperCollection(foodList);
        mExtendsCollection(fruitList);
        mSuperCollection(fruitList);
    }

    /**
     * producer
     */
    public static void mExtends() {
        Plate<? extends Fruit> fruitPlate = new Plate<>();
        Fruit fruit = fruitPlate.get();
        Food food = fruitPlate.get();
    }

    /**
     * consumer
     */
    public static void mSuper() {
        Plate<? super Fruit> fruitPlate = new Plate<>();
        Apple apple = new Apple();
        Fruit fruit = new Fruit();
        Food food = new Food();
        fruitPlate.set(apple);
        fruitPlate.set(fruit);
    }

    /**
     * consumer
     */
    public static void mSuperCollection(List<? super Fruit> fruits) {
        fruits.add(new Apple());
        fruits.add(new Fruit());
    }

    /**
     * producer
     */
    public static void mExtendsCollection(List<? extends Fruit> fruits) {
        for (Fruit fruit : fruits) {
        }
    }
}
