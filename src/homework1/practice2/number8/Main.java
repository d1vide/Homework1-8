package homework1.practice2.number8;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int len = 5;
        String buf = "";
        String[] array = new String[len];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < len; i++) {
            array[i] = in.nextLine();
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < len / 2 ; i++) {
            buf = array[i];
            array[i] = array[len - i - 1];
            array[len - i - 1] = buf;
        }
        System.out.println(Arrays.toString(array));
    }

}
