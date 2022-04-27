package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {
    @Override
    public int compare(Item price1, Item price2) {
        if (price1.getPrice() > price2.getPrice()){
            return 1;
        } else if (price1.getPrice() < price2.getPrice()){
            return -1;
        }
        return 0;
    }
}
