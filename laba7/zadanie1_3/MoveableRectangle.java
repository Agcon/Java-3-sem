package ru.agcon.new_labs.laba7.zadanie1_3;

public class MoveableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MoveableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean equal_speeds(){
        return Math.pow(this.topLeft.xSpeed, 2) + Math.pow(this.topLeft.ySpeed, 2) == Math.pow(this.bottomRight.xSpeed, 2) + Math.pow(this.bottomRight.ySpeed, 2);
    }

    @Override
    public String toString() {
        return "MoveableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }


    @Override
    public void moveUp() {
        this.topLeft.y += this.topLeft.ySpeed;
        this.bottomRight.y += this.bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        this.topLeft.y -= this.topLeft.ySpeed;
        this.bottomRight.y -= this.bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.topLeft.x -= this.topLeft.xSpeed;
        this.bottomRight.x -= this.bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        this.topLeft.x += this.topLeft.xSpeed;
        this.bottomRight.x += this.bottomRight.xSpeed;
    }
}
