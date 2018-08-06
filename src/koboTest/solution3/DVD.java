package koboTest.solution3;

/**
 * Created by abhilash on 2018-08-06.
 */
public class DVD implements Item {
    private Boolean isSingle;
    private double weight;
    private int numOfDisks;

    public DVD(Boolean isSingle, double weight, int numOfDisks) {
        this.isSingle = isSingle;
        this.weight = weight;
        this.numOfDisks = numOfDisks;
    }

    @Override
    public void accept(PostageInterface postage) {
        postage.visit(this);
    }

    public double getWeight() {
        return weight;
    }

    public Boolean getSingle() {
        return isSingle;
    }

    public int getNumOfDisks() {
        return numOfDisks;
    }
}
