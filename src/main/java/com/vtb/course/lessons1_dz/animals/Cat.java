package com.vtb.course.lessons1_dz.animals;

public final class Cat extends Animals {
    public static int count;

    public Cat() {
        count++;
    }

    @Override
    public void run(int range) {
        if (range > 0 && range <= 200)
            System.out.println("Кошка пробегает: " + range + " метров");
        else
            System.out.println("Кошка не может пробежать: " + range + " метров");
    }

    @Override
    public void swim(int range) {
        System.out.println("Кошка не умеет плавать");
    }
}
