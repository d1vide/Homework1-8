package homework1.practice7.number4;

public class MathFunc implements MathCalculable {

    @Override
    public void power(double x, double p) {
        System.out.println(Math.pow(x, p));
    }

    @Override
    public void abs_complex(double x, double y) {
        System.out.println(Math.sqrt(x*x+y*y));
    }

}
