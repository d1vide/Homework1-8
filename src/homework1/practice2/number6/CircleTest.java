package homework1.practice2.number6;

public class CircleTest {
    public static void main(String[] args) {
        Circle obj1 = new Circle(1, -2, 5);
        Circle obj2 = new Circle(5, 1, 3);
        Circle obj3 = new Circle(1, -2, 5);
        System.out.println("Площадь первого круга: " + obj1.getArea() + "\nДлина второй окружности: "
        + obj2.getLength());

        if (obj1.equals(obj2)) {
            System.out.println("Окружность 1 и 2 равны");
        }
        else {
            System.out.println("Окружность 1 и 2 не равны");
        }

        if (obj1.equals(obj3)) {
            System.out.println("Окружность 1 и 3 равны");
        }
        else {
            System.out.println("Окружность 1 и 3 не равны");
        }
    }
}
