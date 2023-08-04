package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {


    @Override
    public int compare(Item o1, Item o2) {
        Double price1 = o1.getPrice();
        Double price2 = o2.getPrice();

        return price1.compareTo(price2);
    }
}
