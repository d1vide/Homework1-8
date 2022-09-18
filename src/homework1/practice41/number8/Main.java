package homework1.practice41.number8;

public class Main {
    public static void main(String[] args) {
        Circle objCircle = new Circle("red", true, 15);
        System.out.println(objCircle.getArea());

        System.out.println(objCircle.toString());

        Rectangle objRectangle = new Rectangle(13.2, 15);
        System.out.println(objRectangle.getPerimeter());

        System.out.println(objRectangle.toString());

        Square objSquare = new Square();
        System.out.println(objSquare.toString());
    }
}
