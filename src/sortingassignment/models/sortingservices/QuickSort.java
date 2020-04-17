package sortingassignment.models.sortingservices;

import java.util.ArrayList;
import sortingassignment.models.Tshirt;

public class QuickSort extends Sort {

    @Override
    public ArrayList<Tshirt> sort(ArrayList<Tshirt> array, int typeOfSort, int sortOrder) {
        quickSort(array, 0, array.size() - 1, typeOfSort, sortOrder);
        return array;
    }

    public void quickSort(ArrayList<Tshirt> arr, int low, int high, int typeOfSort, int sortOrder) {

        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high, typeOfSort, sortOrder);

            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1, typeOfSort, sortOrder);
            quickSort(arr, pi + 1, high, typeOfSort, sortOrder);
        }
    }

    int partition(ArrayList<Tshirt> arr, int low, int high, int typeOfSort, int type) {
        int i = 0;
        Tshirt pivot = arr.get(high);
        switch (typeOfSort) {
            case 1:
                int ps = pivot.getSize().ordinal();
                i = (low - 1); // index of smaller element

                for (int j = low; j < high; j++) {
                    // If current element is smaller than the pivot
                    if (type == 1) {

                        if (arr.get(j).getSize().ordinal() < ps) {
                            i++;

                            // swap arr[i] and arr[j]
                            Tshirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                    } else {
                        if (arr.get(j).getSize().ordinal() > ps) {
                            i++;

                            // swap arr[i] and arr[j]
                            Tshirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);

                        }
                    }
                }
                // swap arr[i+1] and arr[high] (or pivot)
                Tshirt tempS = arr.get(i + 1);
                arr.set(i + 1, arr.get(high));
                arr.set(high, tempS);

                break;

            case 2:
                int pc = pivot.getColor().ordinal();
                i = (low - 1); // index of smaller element

                for (int j = low; j < high; j++) {
                    // If current element is smaller than the pivot
                    if (type == 1) {

                        if (arr.get(j).getSize().ordinal() < pc) {
                            i++;

                            // swap arr[i] and arr[j]
                            Tshirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                    } else {
                        if (arr.get(j).getSize().ordinal() > pc) {
                            i++;

                            // swap arr[i] and arr[j]
                            Tshirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);

                        }
                    }
                }
                // swap arr[i+1] and arr[high] (or pivot)
                Tshirt tempC = arr.get(i + 1);
                arr.set(i + 1, arr.get(high));
                arr.set(high, tempC);
                break;
            case 3:
                int pf = pivot.getFabric().ordinal();
                i = (low - 1); // index of smaller element

                for (int j = low; j < high; j++) {
                    // If current element is smaller than the pivot
                    if (type == 1) {

                        if (arr.get(j).getFabric().ordinal() < pf) {
                            i++;

                            // swap arr[i] and arr[j]
                            Tshirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                    } else {
                        if (arr.get(j).getFabric().ordinal() > pf) {
                            i++;

                            // swap arr[i] and arr[j]
                            Tshirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);

                        }
                    }
                }
                // swap arr[i+1] and arr[high] (or pivot)
                Tshirt tempF = arr.get(i + 1);
                arr.set(i + 1, arr.get(high));
                arr.set(high, tempF);
                break;
        }

        return i + 1;
    }

}
