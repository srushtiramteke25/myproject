package types.sorts;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String args[]){
        int arr[] = {20,40,10,50,30};
        System.out.println("Sorted array"+ Arrays.toString(insertionSort(arr)));

    }

    public static int[] insertionSort(int arr[]){
        int temp=0;
        for(int i=1; i<=arr.length-1;i++){
           temp = arr[i];
           int j = i-1;
           while(j>=0 && arr[j]>temp){
               arr[j+1] = arr[j];
               j--;
           }
           arr[j+1] = temp;
        }
        return arr;
    }

}
