package kz.leila.animals;

public abstract class Animal {
    String name;
    double runLimit;
    double jumpLimit;
    double swimLimit;

    public Animal(String name, double runLimit, double jumpLimit, double swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.swimLimit = swimLimit;
    }

    public void run(double distance) {
        if (distance <= runLimit) {
            System.out.println(name + " бежит " + distance + " метров: true");
        } else {
            System.out.println(name + " не может пробежать " + distance + " метров: false");
        }
    }

    public void jump(double height) {
        if (height <= jumpLimit) {
            System.out.println(name + " перепрыгивает препятствие высотой " + height + " метра: true");
        } else {
            System.out.println(name + " не может перепрыгнуть препятствие высотой " + height + " метра: false");
        }
    }

    public void swim(double distance) {
        if (swimLimit == 0) {
            System.out.println(name + " не умеет плавать: false");
        } else if (distance <= swimLimit) {
            System.out.println(name + " плывет " + distance + " метров: true");
        } else {
            System.out.println(name + " не может проплыть " + distance + " метров: false");
        }
    }
}