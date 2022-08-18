package com.company;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Object,Object>mashina=new HashMap<>();
        Car car=new Car(89,7686);
        CarInfo info=new CarInfo(2010,"Blue",20000,"Ar24");
        mashina.put(car,info);
        System.out.println(mashina.entrySet());
    }
}


   /* Car деген класс тузунуз (Id, номер авто)
    Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
    HashMap тузунуз ключ - машина, маани - машинанын данныйлары
        HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.*/