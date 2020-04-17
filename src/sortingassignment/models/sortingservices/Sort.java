package sortingassignment.models.sortingservices;

import java.util.ArrayList;
import sortingassignment.models.Color;
import sortingassignment.models.Size;
import sortingassignment.models.Tshirt;

/**
 *
 * @author Admin
 */
public abstract class Sort {

    /**
     *
     * @param array
     * @param sortOrder (1 for ascending, 2 for descending)
     * @return array sorted by size,color,fabric
     */
    public ArrayList<Tshirt> completeSort(ArrayList<Tshirt> array, int sortOrder) {

        ArrayList<Tshirt> sortedTShirts = new ArrayList<>();
        ArrayList<Tshirt> sortedByOneSize = new ArrayList<>();
        ArrayList<Tshirt> tempSort = new ArrayList<>();
        ArrayList<Tshirt> sortedByOneSizeAndColor = new ArrayList<>();
        ArrayList<Tshirt> sortedByOneSizeAndOneColor = new ArrayList<>();

        tempSort.addAll(sort(array, 1, sortOrder));
        if (sortOrder == 1) {
            for (int j = 0; j < Size.values().length; j++) {
                sortedByOneSize.clear();
                sortedByOneSizeAndColor.clear();

                for (int i = 0; i < tempSort.size(); i++) {
                    if (tempSort.get(i).getSize().ordinal() == j) {
                        sortedByOneSize.add(tempSort.get(i));
                    }
                }
                // shorted by one size and color.
                sortedByOneSizeAndColor.addAll(sort(sortedByOneSize, 2, sortOrder));

                //one size and one color and sort by  fabric
                for (int l = 0; l < Color.values().length; l++) {
                    sortedByOneSizeAndOneColor.clear();
                    for (int k = 0; k < sortedByOneSizeAndColor.size(); k++) {
                        if (sortedByOneSizeAndColor.get(k).getColor().ordinal() == l) {
                            sortedByOneSizeAndOneColor.add(sortedByOneSizeAndColor.get(k));
                        }
                    }
                    sortedTShirts.addAll(sort(sortedByOneSizeAndOneColor, 3, sortOrder));
                }

            }
        } else {

            for (int j = Size.values().length; j >= 0; j--) {
                sortedByOneSize.clear();
                sortedByOneSizeAndColor.clear();

                for (int i = 0; i < tempSort.size(); i++) {
                    if (tempSort.get(i).getSize().ordinal() == j) {
                        sortedByOneSize.add(tempSort.get(i));
                    }
                }
                // shorted by one size and color.
                sortedByOneSizeAndColor.addAll(sort(sortedByOneSize, 2, sortOrder));

                //one size and one color and sort by  fabric
                for (int l = Color.values().length; l >= 0; l--) {
                    sortedByOneSizeAndOneColor.clear();
                    for (int k = 0; k < sortedByOneSizeAndColor.size(); k++) {
                        if (sortedByOneSizeAndColor.get(k).getColor().ordinal() == l) {
                            sortedByOneSizeAndOneColor.add(sortedByOneSizeAndColor.get(k));
                        }
                    }
                    sortedTShirts.addAll(sort(sortedByOneSizeAndOneColor, 3, sortOrder));
                }

            }
        }

        return sortedTShirts;
    }

    /**
     *
     * @param array
     * @param typeOfSort (1 for size, 2 for color, 3 for fabric)
     * @param sortOrder (1 for ascending, 2 for descending)
     * @return array sorted acording to parameters
     */
    public abstract ArrayList<Tshirt> sort(ArrayList<Tshirt> array, int typeOfSort, int sortOrder);

}
