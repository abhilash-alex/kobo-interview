package koboTest.solution3;

import java.util.ArrayList;

/**
 * Created by abhilash on 2018-08-06.
 */
public class ShoppingCart {
    private ArrayList<Item> items;

    public ShoppingCart(ArrayList<Item> items) {
        this.items = items;
    }

    public double calculatePostage() {
        Postage postage = new Postage();
        for(Item item: items) {
            item.accept(postage);
        }

        return postage.getTotalPostage();
    }
}
