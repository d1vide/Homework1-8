package homework1.practice1.number6;

public class Main {
    public static double harmonicSeries(double num) {
        double sum = 0;
        while (num >= 1) {
            sum += (1/num);
            num -= 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Число " + i + ": " + harmonicSeries(i) + '\n');
        }

    }
}
