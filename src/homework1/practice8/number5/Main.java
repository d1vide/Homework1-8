package homework1.practice8.number5;

public class Main {
    public static int summ(int n) {
        if (n < 10) {
            return n;
        } else {
            return (n % 10) + summ(n / 10);
        }

    }

    public static void main(String[] args) {
        System.out.println(summ(135));
    }
}
