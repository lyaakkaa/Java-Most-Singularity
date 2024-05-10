package kz.leila.obstacles;

import kz.leila.players.Cat;
import kz.leila.players.Human;
import kz.leila.players.Robot;

public class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean jumpOver(Human human) {
        return human.jumpWall(height);
    }

    public boolean jumpOver(Cat cat) {
        return cat.jumpWall(height);
    }

    public boolean jumpOver(Robot robot) {
        return robot.jumpWall(height);
    }
}
