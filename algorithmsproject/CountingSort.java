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
public class CountingSort {
    public void countSort(int arrA[]) {
    int n = arrA.length;
      // creat array B
    int[] arrB = new int[n + 1];
    // find a max number in array A
    int x = arrA[0];
    for (int i = 1; i < n; i++) {
      if (arrA[i] > x)
        x = arrA[i];
    }
    // creat array c 
    int[] count_arr = new int[x + 1];

    // initialize  array c
    for (int i = 0; i < x; ++i) {
      count_arr[i] = 0;
    }
    //counter for each value
    for (int i = 0; i < n; i++) {
      count_arr[arrA[i]]++;
    }
    //accumulation to maintain the order of similer elements(staple)
    for (int i = 1; i <= x; i++) {
      count_arr[i] += count_arr[i - 1];
    }
    //sort and give each element its suitable index
    for (int i = n - 1; i >= 0; i--) {
      arrB[count_arr[arrA[i]] - 1] = arrA[i];
      count_arr[arrA[i]]--;
    }
  }
}
