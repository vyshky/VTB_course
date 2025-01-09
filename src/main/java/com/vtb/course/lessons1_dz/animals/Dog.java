package com.vtb.course.lessons1_dz.animals;

public final class Dog extends Animals {
    public static int count;

    public Dog() {
        count++;
    }
    @Override
    public void run(int range) {
        if (range > 0 && range <= 500)
            System.out.println("Собака пробежала: " + range + " метров");
        else
            System.out.println("Собака не может пробежать: " + range + " метров");
    }

    @Override
    public void swim(int range) {
        if (range > 0 && range <= 10)
            System.out.println("Собака проплывает: " + range + " метров");
        else
            System.out.println("Собака не может проплыть: " + range + " метров");
    }
}
