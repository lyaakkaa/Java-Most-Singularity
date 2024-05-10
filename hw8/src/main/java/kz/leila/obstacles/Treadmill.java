package kz.leila.obstacles;

import kz.leila.players.Cat;
import kz.leila.players.Human;
import kz.leila.players.Robot;

public class Treadmill {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean passTrack(Human human) {
        return human.runTrack(length);
    }

    public boolean passTrack(Cat cat) {
        return cat.runTrack(length);
    }

    public boolean passTrack(Robot robot) {
        return robot.runTrack(length);
    }
}