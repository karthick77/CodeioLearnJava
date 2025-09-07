package Learn001;

import java.util.Arrays;

public class SecondLargestElementInArray {

    public static void main(String[] args) {

        int[] arr = {12, 27, 1, 5, 77, 21, 4, 3, 99, 22};
        /*
        * To find second largest element in an given array
        * Sorting in ascending order is perform first and then get
        * second largest value from it
        * */
        System.out.println("Before sort: "+ Arrays.toString(arr));
        int temp = 0; // swapping temp variable
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
                //using same logic as swapping
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After sort: "+ Arrays.toString(arr));
        System.out.println("Second largest from sorted array: "+ arr[arr.length-2]);
    }
}
