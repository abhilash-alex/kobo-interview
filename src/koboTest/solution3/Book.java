package koboTest.solution3;

/**
 * Created by abhilash on 2018-08-06.
 */
public class Book implements Item {
    private double price;
    private double weight;

    public Book(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public void accept(PostageInterface postage) {
        postage.visit(this);
    }
    public double getPrice() {
        return price;
    }
    public double getWeight() {
        return weight;
    }
}
