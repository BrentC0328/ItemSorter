package rocks.zipcode.io;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    private Item[] items;

    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {

        for (int i = 0; i < items.length - 1; i++){
            for (int j = 0; j < items.length -1; j++){
                Item theItem = this.items[j];
                Item compareItem = this.items[j+1];

                if(comparator.compare(theItem, compareItem) > 0){
                    this.items[j] = compareItem;
                    this.items[j+1] = theItem;
                }

            }
        }
        return this.items;
    }
}
