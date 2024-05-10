package kz.leila.players;

public class Robot {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public void setMaxJumpHeight(int maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }

    public void run() {
        System.out.println(name + " is running.");
    }

    public void jump() {
        System.out.println(name + " is jumping.");
    }

    public boolean runTrack(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " successfully ran " + distance + " meters.");
            return true;
        } else {
            System.out.println(name + " couldn't run " + distance + " meters.");
            return false;
        }
    }

    public boolean jumpWall(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " successfully jumped over a wall " + height + " meters high.");
            return true;
        } else {
            System.out.println(name + " couldn't jump over a wall " + height + " meters high.");
            return false;
        }
    }
}