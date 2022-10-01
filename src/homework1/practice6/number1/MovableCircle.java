package homework1.practice6.number1;

public class MovableCircle extends MovablePoint{
    private int radius;
    private MovablePoint center;



    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + x + " " + y +
                '}';
    }

}
