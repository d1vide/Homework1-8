package homework1.practice8.number6;

public class Main {
    public static boolean simple_num(int n, int d) {
        if (n == 2) {
            return true;
        }

        else if (n < 2) {
            return false;
        }

        else if (n % d == 0) {
            return false;
        }

        else if (d < (n / 2)) {
            return simple_num(n, d + 1);
        }

        else {
            return true;
        }
    }

    public static void main(String[] args) {
        int d = 2;
        System.out.println(simple_num(18, d));
    }
}
