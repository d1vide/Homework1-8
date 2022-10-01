package homework1.practice6.number1;

public class Main {
    public static void main(String[] args) {
        MovableCircle circle1 = new MovableCircle(3, -2, 1, 2, 5);
        circle1.moveDown();
        System.out.println(circle1.toString());

    }
}
