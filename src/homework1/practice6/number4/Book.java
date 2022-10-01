package homework1.practice6.number4;

public class Book implements Priceable{
    private double price;

    public Book(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }



}
