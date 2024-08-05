package types.sorts;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String args[]){
        int arr[] = {40,10,20,50,30};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
//because the last value of the arr will be fixed
    public static int[] bubbleSort(int arr[]){
        int temp=0; int passes =0; int compare = 0;
        for(int i=1; i<arr.length; i++){
            boolean isSwapped=false;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                  temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                  isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        System.out.println("Passes-"+passes);
        System.out.println("Comparisons-"+compare);

        return arr;

    }
}
