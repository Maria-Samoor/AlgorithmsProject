/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsproject;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class AlgorithmsProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long startTime,endTime;
        int x,n,arr[],arr2[],arr3[],arr4[];
       
         Scanner input = new Scanner(System.in);
        CountingSort cs = new CountingSort();
        InsertionSort is = new InsertionSort();
        Quicksort qs = new Quicksort();
        MergeSort ms=new MergeSort();

        System.out.println("Enter Number of arrays you want to sort: ");
        x= input.nextInt();
        for (int i = 1;i<=x;i++){
            System.out.println("Enter number of elements in array number "+i+" :");
            n= input.nextInt();
            arr = new int[n];
            arr2 = new int[n];
            arr3 = new int[n];
            arr4 = new int[n];
            for(int j =0;j<n; j++)
            {
            arr[j]=(int) (Math.random()*10000);
            arr2[j]=arr3[j]=arr4[j]=arr[j];
            }
            startTime =  System.nanoTime();
            cs.countSort(arr);
            endTime=System.nanoTime();
            System.out.println("Time taken for sorting array of "+n+" random elment using countSort is : "+(endTime-startTime)/Math.pow(10, 3)+" micro second");
                   
            startTime =  System.nanoTime();
            is.insertionSort(arr2);
            endTime=System.nanoTime();
            System.out.println("Time taken for sorting array of "+n+" random elment using InsertionSort is : "+(endTime-startTime)/Math.pow(10, 3)+" micro second");
            startTime =  System.nanoTime();
            qs.iterativeQuicksort(arr3);
            endTime=System.nanoTime();
            System.out.println("Time taken for sorting array of "+n+" random elment using Quicksort is : "+(endTime-startTime)/Math.pow(10, 3)+" micro second");
            startTime =  System.nanoTime();
            ms.mergeSort(arr4);
            endTime=System.nanoTime();
            System.out.println("Time taken for sorting array of "+n+" random elment using MergeSort is : "+(endTime-startTime)/Math.pow(10, 3)+" micro second");
        }
    }
}