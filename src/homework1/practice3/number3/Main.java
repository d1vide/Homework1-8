package homework1.practice3.number3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(10, 100);
        }
        System.out.println(Arrays.toString(array));

        if (array[0] < array[1] && array[1] < array[2] && array[2] < array[3]) {
            System.out.println("Последовательность строго возрастающая");
        }
        else {
            System.out.println("Последовательность не возрастает");
        }

    }
}
