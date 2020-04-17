/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingassignment;

import java.util.ArrayList;
import java.util.List;
import sortingassignment.models.Tshirt;
import sortingassignment.models.sortingservices.BubbleSort;
import sortingassignment.models.sortingservices.BucketSort;
import sortingassignment.models.sortingservices.QuickSort;
import sortingassignment.models.sortingservices.Sort;

/**
 *
 * @author Admin
 */
public class SortingAssignment {

    ArrayList<Tshirt> tshirts;

    public static List<Tshirt> generateTShirts(int quantity) {
        ArrayList<Tshirt> tshirts = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            tshirts.add(new Tshirt());
        }
        return tshirts;
    }

    public static void showTshirts(ArrayList<Tshirt> mytshirts) {
        System.out.println("************");
        for (Tshirt t : mytshirts) {
            System.out.println("Product name: " + t.getName()
                    + ", size: " + t.getSize() + ", fabric: " + t.getFabric()
                    + ", color: " + t.getColor() + ".");

        }
    }

    public static void main(String[] args) {
        ArrayList<Tshirt> mytshirts = (ArrayList<Tshirt>) generateTShirts(400);
//        showTshirts(mytshirts);

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        BucketSort bus = new BucketSort();

        runSortingAlgorithm(qs, mytshirts, "quicksort");
        runSortingAlgorithm(bs, mytshirts, "bubblesort");
        runSortingAlgorithm(bus, mytshirts, "bucketsort");

    }

    private static void runSortingAlgorithm(Sort sort, ArrayList<Tshirt> mytshirts, String algorithm) {
        long startTime = System.currentTimeMillis();
        sort.completeSort(mytshirts, 2);
//        showTshirts(sort.completeSort(mytshirts, 2));
        long endTime = System.currentTimeMillis();
        System.out.println("Time " + algorithm + " needs to complete a sort: " + (endTime - startTime) + " ms.");

    }

}
