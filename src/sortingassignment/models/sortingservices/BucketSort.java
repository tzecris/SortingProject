package sortingassignment.models.sortingservices;

import java.util.ArrayList;
import sortingassignment.models.Tshirt;

/**
 *
 * @author Admin
 */
public class BucketSort {

    public ArrayList<Tshirt> sort(ArrayList<Tshirt> array, int typeOfSort, int order) {
        // typeofSort = 1, Size
        // typeofSort = 2, Color
        // typeofSort = 3, Fabric

        // order = 1, ASC
        // order = 2, DESC
        int aSize = array.size();
        int buckets[] = new int[aSize + 1];
        int current = -1;
        for (int i = 0; i < aSize; i++) {
            buckets[i] = 0;
        }
        for (int i = 0; i < aSize; i++) {

            switch (typeOfSort) {
                case 1:
                    current = array.get(i).getSize().ordinal();
                    break;
                case 2:
                    current = array.get(i).getColor().ordinal();
                    break;
                case 3:
                    current = array.get(i).getFabric().ordinal();
                    break;
            }

            buckets[current]++;
        }
        ArrayList<Tshirt> sortedTShirts = new ArrayList<>();
        if (order == 1) {
            for (int j = 0; j < buckets.length; j++) {
                if (buckets[j] > 0) {
                    for (int i = 0; i < aSize; i++) {
                        switch (typeOfSort) {
                            case 1:
                                if (array.get(i).getSize().ordinal() == j) {
                                    sortedTShirts.add(array.get(i));
                                }
                                break;
                            case 2:
                                if (array.get(i).getColor().ordinal() == j) {
                                    sortedTShirts.add(array.get(i));
                                }
                                break;
                            case 3:
                                if (array.get(i).getFabric().ordinal() == j) {
                                    sortedTShirts.add(array.get(i));
                                }
                                break;
                        }
                    }
                }
            }
        } else {
            for (int j = buckets.length - 1; j >= 0; j--) {
                if (buckets[j] > 0) {
                    for (int i = 0; i < aSize; i++) {
                        switch (typeOfSort) {
                            case 1:
                                if (array.get(i).getSize().ordinal() == j) {
                                    sortedTShirts.add(array.get(i));
                                }
                                break;
                            case 2:
                                if (array.get(i).getColor().ordinal() == j) {
                                    sortedTShirts.add(array.get(i));
                                }
                                break;
                            case 3:
                                if (array.get(i).getFabric().ordinal() == j) {
                                    sortedTShirts.add(array.get(i));
                                }
                                break;
                        }
                    }
                }
            }
        }

        return sortedTShirts;
    }

    public ArrayList<Tshirt> colpleteSort(ArrayList<Tshirt> array, int order) {
        return null;
    }
}
