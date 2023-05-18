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
public class MergeSort {
     void mergeSort(int arr[])
{ 
        int n = arr.length;
	int temp[]= new int[arr.length+1];
	int size=1;
	while(size<n)
	{
		mergePass(arr,temp,size,n);
		size=size*2;
	}
}
void mergePass(int arr[],int temp[],int size,int n)
{
	int i,low1,up1,low2,up2;
	low1=0;
	while(low1+size<n)
	{
		up1=low1+size-1;
		low2=low1+size;
		up2=low2+size-1;
		if(up2>=n)
		  up2=n-1;
		merge(arr,temp,low1,up1,low2,up2);
		low1=up2+1;
	}
	//MAKE SURE TO ADD THESE TWO LINES OF CODE TO GET THE CORRECT OUTPUT
	for(i=low1;i<=n-1;i++)
	   temp[i]=arr[i];
	//THESE ARE FOR COPYING THE REST OF ELEMENTS OF ARRAY IN TEMP ARRAY
	copy(arr,temp,n);
}
void merge(int Arr[],int temp[],int low1,int up1,int low2,int up2)
{
	int i=low1,j=low2,k=low1;
	while(i<=up1 && j<=up2)
	{
		if(Arr[i]<Arr[j])
		 temp[k++]=Arr[i++];
		else
		 temp[k++]=Arr[j++];
	}
	while(i<=up1)
		temp[k++]=Arr[i++];
	while(j<=up2)
		temp[k++]=Arr[j++];
}
void copy(int Arr[],int temp[],int n)
{
	int i;
	for(i=0;i<n;i++)
	Arr[i]=temp[i];
}
}
