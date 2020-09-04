package jvm.extendsandsuper;

import jvm.extendsandsuper.container.Plate;
import jvm.extendsandsuper.food.Apple;
import jvm.extendsandsuper.food.Food;
import jvm.extendsandsuper.food.Fruit;

public class NowTest {
    public static void main(String[] args) {
        Plate<Apple> applePlate = new Plate<>();
        Apple appleGetA = applePlate.get();
        applePlate.set(appleGetA);
        Plate<Food> fruitPlate = new Plate<>();
        set(fruitPlate);
        get(applePlate);
    }
    private static void set(Plate<? super Fruit> plate){
        plate.set(new Apple());
        plate.set(new Fruit());
        Object fruit = plate.get();
    }
    private static void get(Plate<? extends Fruit> plate){
        Fruit fruit = plate.get();
    }
}
