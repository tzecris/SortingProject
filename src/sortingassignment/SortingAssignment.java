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
            System.out.println("Product name: " + t.getName() + ", size: " + t.getSize() + ", fabric: " + t.getFabric() + ", color: " + t.getColor() + ".");
//            System.out.println("Product name: " + t.getName() + ", color: " + t.getColor() + ".");
//            System.out.println("Product name: " + t.getName() + ", fabric: " + t.getFabric() + ".");

        }
    }

    public static void main(String[] args) {
        ArrayList<Tshirt> mytshirts = (ArrayList<Tshirt>) generateTShirts(10);
        showTshirts(mytshirts);
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        BucketSort bus = new BucketSort();
        qs.sort(mytshirts, 0, mytshirts.size() - 1, 2, 1);
//        qs.sort(mytshirts, 0, mytshirts.size() - 1, 2, 1);
//        bs.sort(mytshirts, 2);
//        bs.sort(mytshirts, 3, 2);
//        bus.sort(mytshirts, 2, 1);
//        qs.sort(mytshirts, 0, mytshirts.size() - 1, 2);
//        qs.sort(mytshirts, 0, mytshirts.size() - 1, 3, 2);
        System.out.println("Show after sort.");
        showTshirts(mytshirts);
        qs.sort(mytshirts, 0, mytshirts.size() - 1, 1, 1);

        System.out.println("Show after sort.");
        showTshirts(mytshirts);
    }

}
