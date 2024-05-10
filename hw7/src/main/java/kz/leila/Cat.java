package kz.leila;

public class Cat {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            hungry = false;
        } else {
            System.out.println("Not enough food in the plate for " + name);
        }
    }

    public boolean isHungry() {
        return hungry;
    }
}