package koboTest.solution3;

/**
 * Created by abhilash on 2018-08-06
 *
 * Visitor Pattern is used here.
 */
public class Postage implements PostageInterface {
    private double totalPostageForCart;

    public synchronized double getTotalPostage() {
        return totalPostageForCart;
    }

    @Override
    public synchronized void visit(Book book) {
        if(book.getPrice() < 10.0) {
            totalPostageForCart += book.getWeight();
        } else {
            totalPostageForCart += book.getWeight() * 2;
        }
    }

    @Override
    public synchronized void visit(CD cd) {
        if(cd.getSingle()) {
            totalPostageForCart += cd.getWeight();
        } else {
            totalPostageForCart += cd.getWeight() * cd.getNumOfDisks();
        }
    }

    @Override
    public synchronized void visit(DVD dvd) {
        if(dvd.getSingle()) {
            totalPostageForCart += dvd.getWeight() + 10;
        } else {
            totalPostageForCart += (dvd.getWeight()+ 10) * dvd.getNumOfDisks();
        }
    }
}