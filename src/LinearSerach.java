import java.util.Scanner;

public class LinearSerach {

    public static void main(String args[]){
        int arr[]= {12, 22,14,67,3,88};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no you want to search:");

        int index = linearSerach(arr,in.nextInt());
        System.out.println("No is found at index "+index);
    }


    public static int linearSerach(int arr[], int numToSerach ){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==numToSerach){
                return i;
            }
        }
        return -1;
    }
}
