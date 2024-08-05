import java.util.Scanner;

public class BinarySearch {

    public static void main(String args[]){
        int arr[]={11,22,33,44,55,66,77,88,99};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. to serach - ");
        int serachIndex = binarySearch(arr,sc.nextInt());
        System.out.println("Number found at the index: "+serachIndex);

    }

    public static int binarySearch(int arr[], int serachNum){
        int right = arr.length-1;
        int left = 0;

        while(left<=right){
            int mid = right+left/2;
            if(serachNum == arr[mid]){
                return mid;
            }
            else if(serachNum<arr[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
