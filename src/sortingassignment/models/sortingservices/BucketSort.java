package sortingassignment.models.sortingservices;

import java.util.ArrayList;
import sortingassignment.models.Color;
import sortingassignment.models.Fabric;
import sortingassignment.models.Size;
import sortingassignment.models.Tshirt;

public class BucketSort extends Sort {

    @Override
    public ArrayList<Tshirt> sort(ArrayList<Tshirt> array, int typeOfSort, int sortOrder) {

        int aSize = 0;
        switch (typeOfSort) {
            case 1:
                aSize = Size.values().length;
                break;
            case 2:
                aSize = Color.values().length;
                break;
            case 3:
                aSize = Fabric.values().length;
                break;
        }

        int buckets[] = new int[aSize + 1];
        int current = -1;
        for (int i = 0; i < aSize; i++) {
            buckets[i] = 0;
        }
        for (int i = 0; i < array.size(); i++) {

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
        if (sortOrder == 1) {
            for (int j = 0; j < buckets.length; j++) {
                if (buckets[j] > 0) {
                    for (int i = 0; i < array.size(); i++) {
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
                    for (int i = 0; i < array.size(); i++) {
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

//    @Override
//    public ArrayList<Tshirt> completeSort(ArrayList<Tshirt> array, int sortOrder) {
//
//        ArrayList<Tshirt> sortedTShirts = new ArrayList<>();
//        ArrayList<Tshirt> sortedByOneSize = new ArrayList<>();
//        ArrayList<Tshirt> tempSort = new ArrayList<>();
//        ArrayList<Tshirt> sortedByOneSizeAndColor = new ArrayList<>();
//        ArrayList<Tshirt> sortedByOneSizeAndOneColor = new ArrayList<>();
//
//        tempSort.addAll(sort(array, 1, sortOrder));
//        if (sortOrder == 1) {
//            for (int j = 0; j < Size.values().length; j++) {
//                sortedByOneSize.clear();
//                sortedByOneSizeAndColor.clear();
//
//                for (int i = 0; i < tempSort.size(); i++) {
//                    if (tempSort.get(i).getSize().ordinal() == j) {
//                        sortedByOneSize.add(tempSort.get(i));
//                    }
//                }
//                // shorted by one size and color.
//                sortedByOneSizeAndColor.addAll(sort(sortedByOneSize, 2, sortOrder));
//
//                //one size and one color and sort by  fabric
//                for (int l = 0; l < Color.values().length; l++) {
//                    sortedByOneSizeAndOneColor.clear();
//                    for (int k = 0; k < sortedByOneSizeAndColor.size(); k++) {
//                        if (sortedByOneSizeAndColor.get(k).getColor().ordinal() == l) {
//                            sortedByOneSizeAndOneColor.add(sortedByOneSizeAndColor.get(k));
//                        }
//                    }
//                    sortedTShirts.addAll(sort(sortedByOneSizeAndOneColor, 3, sortOrder));
//                }
//
//            }
//        } else {
//
//            for (int j = Size.values().length; j >= 0; j--) {
//                sortedByOneSize.clear();
//                sortedByOneSizeAndColor.clear();
//
//                for (int i = 0; i < tempSort.size(); i++) {
//                    if (tempSort.get(i).getSize().ordinal() == j) {
//                        sortedByOneSize.add(tempSort.get(i));
//                    }
//                }
//                // shorted by one size and color.
//                sortedByOneSizeAndColor.addAll(sort(sortedByOneSize, 2, sortOrder));
//
//                //one size and one color and sort by  fabric
//                for (int l = Color.values().length; l >= 0; l--) {
//                    sortedByOneSizeAndOneColor.clear();
//                    for (int k = 0; k < sortedByOneSizeAndColor.size(); k++) {
//                        if (sortedByOneSizeAndColor.get(k).getColor().ordinal() == l) {
//                            sortedByOneSizeAndOneColor.add(sortedByOneSizeAndColor.get(k));
//                        }
//                    }
//                    sortedTShirts.addAll(sort(sortedByOneSizeAndOneColor, 3, sortOrder));
//                }
//
//            }
//        }
//
//        return sortedTShirts;
//    }
}
