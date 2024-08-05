package types.sorts;

import java.util.Arrays;
import java.util.Scanner;
//complexity T=O(n^2)
//S(n)=O(1)
public class SelectionSort {

    public static void main(String args[]){
        int arr[] = {40,10,30,20,50,60};
        System.out.println("Our sorted array--"+Arrays.toString(selectionSort(arr)));
    }

    private static int[] selectionSort(int[] arr) {
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
            }
            }
        }
        return arr;
    }
}
