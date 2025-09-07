package Learn001;

import java.util.Arrays;

public class ReverseAnArrayInPlace {

    public static void main(String[] args) {

        //Note: logic got from google search
        //int[] arr = {12, 27, 1, 5, 77, 21, 4, 3, 99, 22};
        int[] arr = {12, 27, 1, 5, 4};

        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("After reverse: "+ Arrays.toString(arr));
    }
}
