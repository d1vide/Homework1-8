package homework1.practice3.number5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int flag = 0;
        String str = "";

        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        while (flag == 0) {
            str = in.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if ((int) str.charAt(i) < 48 || (int) str.charAt(i) > 57) {
                    System.out.println("Введенно некорректное число, повторите ввод");
                    break;
                }
                if (str.charAt(str.length() - 1) == str.charAt(i)) {
                    flag = 1;
                }
                if (str.equals("0")) {
                    System.out.println("Введенно некорректное число, повторите ввод");
                    flag = 0;
                }
            }
        }

        int n = Integer.parseInt(str);
        int[] array = new int[n];
        Random random = new Random();
        int countEven = 0;

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(0, n);
            if (array[i] % 2 == 0) {
                countEven++;
            }
        }

        System.out.println(Arrays.toString(array));

        int[] arrayEven = new int[countEven];
        int k = 0; // счетчик

        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                arrayEven[k] = array[i];
                k++;
            }
        }

        System.out.println(Arrays.toString(arrayEven));


    }
}
