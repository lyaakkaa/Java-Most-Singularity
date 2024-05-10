package kz.leila;

import kz.leila.obstacles.Treadmill;
import kz.leila.obstacles.Wall;
import kz.leila.players.Cat;
import kz.leila.players.Human;
import kz.leila.players.Robot;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human("Tim", 100, 2);
        Cat cat = new Cat("Barsik", 50, 3);
        Robot robot = new Robot("Hero", 200, 5);

        Treadmill treadmill = new Treadmill(70);
        Wall wall = new Wall(2);

        if (treadmill.passTrack(human)) {
            wall.jumpOver(human);
        }

        if (treadmill.passTrack(cat)) {
            wall.jumpOver(cat);
        }

        if (treadmill.passTrack(robot)) {
            wall.jumpOver(robot);
        }
    }
}