package com.vtb.course.lessons1_dz;

import com.vtb.course.lessons1_dz.animals.Animals;
import com.vtb.course.lessons1_dz.animals.Cat;
import com.vtb.course.lessons1_dz.animals.Dog;
import com.vtb.course.lessons1_dz.animals.Tiger;

public class App {

    public static void main(String[] args) {
        Animals tiger = new Tiger();
        tiger.run(100);
        tiger.swim(100);

        Animals dog = new Dog();
        dog.run(100);
        dog.swim(100);

        Animals cat = new Cat();
        cat.run(200);
        cat.swim(200);


        int countDog = 0;
        int countCat = 0;
        int countTiger = 0;

        Animals[] animals = new Animals[]{
                new Dog(), new Cat(), new Tiger(),
                new Dog(), new Cat(), new Tiger(),
                new Dog(), new Dog(), new Dog(),
        };

        for (Animals animal : animals) {
            if (animal instanceof Cat) {
                ++countCat;
            } else if (animal instanceof Dog) {
                countDog++;
            } else {
                countTiger++;
            }
            animal.run(100);
            animal.swim(100);
        }

        System.out.println("Всего кошек/котов: "+ countCat);
        System.out.println("Всего собак: "+ countDog);
        System.out.println("Всего тигров: "+ countTiger);

    }
}
