package kz.leila;

public class Plate {
    private int capacity;
    private int food;

    public Plate(int capacity) {
        this.capacity = capacity;
        this.food = 0;
    }

    public void fillMax() {
        food = capacity;
    }

    public void info() {
        System.out.printf("Plate: %d / %d\n", food, capacity);
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        } else {
            System.out.println("Not enough food in the plate.");
        }
    }

    public void addFood(int amount) {
        food += amount;
        if (food > capacity) {
            food = capacity;
        }
    }

    public int getFood() {
        return food;
    }
}