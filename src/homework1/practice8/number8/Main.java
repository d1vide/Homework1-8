package homework1.practice8.number8;

public class Main {
    public static boolean palindrom(String s) {
        if (s.length() <= 1) {
            return true;
        }
        else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                s = s.substring(1, s.length() - 1);
                return palindrom(s);
            }
            else {
                return false;
            }

        }
    }
    public static void main(String[] args) {
        System.out.println(palindrom("12321"));
    }
}
