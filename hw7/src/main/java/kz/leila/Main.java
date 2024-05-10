package kz.leila;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.addFood(50);

        Cat[] cats = {new Cat("Barsik", 30), new Cat("Tom", 20), new Cat("Keksik", 40)};

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + " is hungry: " + cat.isHungry());
        }

        plate.info();
    }
}