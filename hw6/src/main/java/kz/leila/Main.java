package kz.leila;

import kz.leila.animals.Cat;
import kz.leila.animals.Dog;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Dog dog1 = new Dog("Собака1", 500 + random.nextInt(200), 0.5 + random.nextDouble() * 0.5, 10);
        Dog dog2 = new Dog("Собака2", 500 + random.nextInt(200), 0.5 + random.nextDouble() * 0.5, 10);
        Cat cat1 = new Cat("Кот1", 200 + random.nextInt(200), 2 + random.nextDouble() * 0.5, 0);
        Cat cat2 = new Cat("Кот2", 200 + random.nextInt(200), 2 + random.nextDouble() * 0.5, 0);

        dog1.run(400);
        dog2.jump(0.6);
        cat1.swim(5);
        cat2.run(250);
    }
}