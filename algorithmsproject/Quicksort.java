/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsproject;

import java.util.Stack;

class Pair
{
    private final int x;
    private final int y;
 
    Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
 
    public int getX() {
        return x; 
    }
    public int getY() { 
        return y; 
    }
}
public class Quicksort {
    public  void swap (int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
 
    public  int partition(int a[], int start, int end)
    {
        // Pick the rightmost element as a pivot from the array
        int pivot = a[end];
 
        // elements less than the pivot will go to the left of `pIndex`
        // elements more than the pivot will go to the right of `pIndex`
        // equal elements can go either way
        int pIndex = start;
 
        // each time we find an element less than or equal to the pivot,
        // `pIndex` is incremented, and that element would be placed
        // before the pivot.
        for (int i = start; i < end; i++)
        {
            if (a[i] <= pivot)
            {
                swap(a, i, pIndex);
                pIndex++;
            }
        }
 
        // swap `pIndex` with pivot
        swap (a, pIndex, end);
 
        // return `pIndex` (index of the pivot element)
        return pIndex;
    }
 
    // Iterative Quicksort routine
    public  void iterativeQuicksort(int[] a)
    {
        // create a stack for storing subarray start and end index
        Stack<Pair> stack = new Stack<>();
        
        // get the starting and ending index of the given array
        int start = 0;
        int end = a.length - 1;
        
        // push the start and end index of the array into the stack
        stack.push(new Pair(start, end));
 
        // loop till stack is empty
        while (!stack.empty())
        {
            // remove top pair from the list and get subarray starting
            // and ending indices
            start = stack.peek().getX();
            end = stack.peek().getY();
            stack.pop();
 
            // rearrange elements across pivot
            int pivot = partition(a, start, end);
 
            // push subarray indices containing elements that are
            // less than the current pivot to stack
            if (pivot - 1 > start) {
                stack.push(new Pair(start, pivot - 1));
            }
 
            // push subarray indices containing elements that are
            // more than the current pivot to stack
            if (pivot + 1 < end) {
                stack.push(new Pair(pivot + 1, end));
            }
        }
    }
    
}
