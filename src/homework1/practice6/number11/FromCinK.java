package homework1.practice6.number11;

public class FromCinK implements Convertable{
    double t;

    public FromCinK(double t) {
        this.t = t;
    }

    @Override
    public void convert() {
        System.out.println(t + 273);
    }
}
