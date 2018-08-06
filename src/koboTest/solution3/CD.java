package koboTest.solution3;

/**
 * Created by abhilash on 2018-08-06.
 */
public class CD implements Item {
    private Boolean isSingle;
    private double weight;
    private int numOfDisks;

    public CD(Boolean isSingle, double weight, int numOfDisks) {
        this.isSingle = isSingle;
        this.weight = weight;
        this.numOfDisks = numOfDisks;
    }

    @Override
    public void accept(PostageInterface postage) {
        postage.visit(this);
    }

    public Boolean getSingle() {
        return isSingle;
    }

    public double getWeight() {
        return weight;
    }

    public int getNumOfDisks() {
        return numOfDisks;
    }
}
