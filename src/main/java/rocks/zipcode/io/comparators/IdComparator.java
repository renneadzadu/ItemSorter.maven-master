package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {
    @Override
    public int compare(Item id1, Item id2) {
        if (id1.getId() > id2.getId()) {
            return 1;
        } else if (id1.getId() < id2.getId()){
            return -1;
        }
        return 0;
    }
}
