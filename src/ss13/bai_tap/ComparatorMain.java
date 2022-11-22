package ss13.bai_tap;

import java.util.Comparator;

public class ComparatorMain implements Comparator<ListOfProducts> {

    @Override
    public int compare(ListOfProducts o1, ListOfProducts o2) {
        if (o1.getPrices() - o2.getPrices() > 0) {
            return 1;
        } else if (o1.getPrices() - o2.getPrices() == 0) {
            return 0;

        } else {
            return -1;
        }
    }
}
