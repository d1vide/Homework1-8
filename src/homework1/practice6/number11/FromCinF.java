package homework1.practice6.number11;

public class FromCinF implements Convertable{
    double t;

    public FromCinF(double t) {
        this.t = t;
    }

    @Override
    public void convert() {
        System.out.println(t * 1.8 + 32);
    }
}
