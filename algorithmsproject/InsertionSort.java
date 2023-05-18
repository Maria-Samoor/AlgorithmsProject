/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsproject;

/**
 *
 * @author User
 */
public class InsertionSort {
    public  void insertionSort(int[] arr)
    {
       int size = arr.length;

    for (int step = 1; step < size; step++) {
      int key = arr[step];
      int j = step - 1;

      // Compare key with each element on the left of it until an element smaller than
      // it is found.
      // For descending order, change key<array[j] to key>array[j].
      while (j >= 0 && key < arr[j]) {
        arr[j + 1] = arr[j];
        --j;
      }

      // Place key at after the element just smaller than it.
      arr[j + 1] = key;
    }
  }
}
