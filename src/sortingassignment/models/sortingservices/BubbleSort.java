/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingassignment.models.sortingservices;

import java.util.ArrayList;
import sortingassignment.models.Tshirt;

/**
 *
 * @author Admin
 */
public class BubbleSort {

    public ArrayList<Tshirt> sort(ArrayList<Tshirt> arr, int typeOfSort, int sort) {

        //typeOfShort 1= size
        //typeOfShort 2= color
        //typeOfShort 3= fabric
        //type 1= ascending
        //type 2= descending
        int n = arr.size();
        switch (typeOfSort) {
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (sort == 1) {
                            if (arr.get(j).getSize().ordinal() > arr.get(j + 1).getSize().ordinal()) {
                                // swap arr[j+1] and arr[i]
                                Tshirt temp = arr.get(j);
                                arr.set(j, arr.get(j + 1));
                                arr.set(j + 1, temp);
                            }
                        } else {
                            if (arr.get(j).getSize().ordinal() < arr.get(j + 1).getSize().ordinal()) {
                                // swap arr[j+1] and arr[i]
                                Tshirt temp = arr.get(j);
                                arr.set(j, arr.get(j + 1));
                                arr.set(j + 1, temp);
                            }
                        }
                    }
                }
                break;

            case 2:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (sort == 1) {
                            if (arr.get(j).getColor().ordinal() > arr.get(j + 1).getColor().ordinal()) {
                                // swap arr[j+1] and arr[i]
                                Tshirt temp = arr.get(j);
                                arr.set(j, arr.get(j + 1));
                                arr.set(j + 1, temp);
                            }
                        } else {
                            if (arr.get(j).getColor().ordinal() < arr.get(j + 1).getColor().ordinal()) {
                                // swap arr[j+1] and arr[i]
                                Tshirt temp = arr.get(j);
                                arr.set(j, arr.get(j + 1));
                                arr.set(j + 1, temp);
                            }
                        }
                    }
                }
                break;
            case 3:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (sort == 1) {
                            if (arr.get(j).getFabric().ordinal() > arr.get(j + 1).getFabric().ordinal()) {
                                // swap arr[j+1] and arr[i]
                                Tshirt temp = arr.get(j);
                                arr.set(j, arr.get(j + 1));
                                arr.set(j + 1, temp);
                            }
                        } else {
                            if (arr.get(j).getFabric().ordinal() < arr.get(j + 1).getFabric().ordinal()) {
                                // swap arr[j+1] and arr[i]
                                Tshirt temp = arr.get(j);
                                arr.set(j, arr.get(j + 1));
                                arr.set(j + 1, temp);
                            }
                        }
                    }
                }
                break;
        }
        return arr;
    }

}
