package homework1.practice1.number4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите кол-во элементов массива: ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();

        System.out.println("Введите массив: ");
        int [] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = in.nextInt();
        }

        int max = array[0];
        int min = array[0];
        int sum = 0;

        int i = 0;
        while (i < len) {
            sum+=array[i];
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            i++;
        }

        System.out.println("Сумма: " + sum + "\nМаксимальный элемент: " + max +
                "\nМинимальный элемент: " + min);

    }
}
