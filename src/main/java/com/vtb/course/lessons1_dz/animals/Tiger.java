package com.vtb.course.lessons1_dz.animals;

public final class Tiger extends Animals {
    @Override
    public void run(int range) {
        if (range > 0 && range <= 1000)
            System.out.println("Тигр пробежала: " + range + " метров");
        else
            System.out.println("Тигр не может пробежать: " + range + " метров");
    }

    @Override
    public void swim(int range) {
        if (range > 0 && range <= 100)
            System.out.println("Тигр проплывает: " + range + " метров");
        else
            System.out.println("Тигр не может проплыть: " + range + " метров");
    }
}
