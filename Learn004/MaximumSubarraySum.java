package Learn004;

public class MaximumSubarraySum {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4, 1};

        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        int start = 0, end = 0, s = 0;

        for(int i=1; i<arr.length; i++){
            if(arr[i] > maxEndingHere + arr[i]){
                maxEndingHere = arr[i];
                s = i;
            }else{
                maxEndingHere += arr[i];
            }
            if(maxEndingHere > maxSoFar){
                maxSoFar = maxEndingHere;
                start = s;
                end = i;
            }
        }

        System.out.println("Max count: "+maxSoFar);
        System.out.println("Subarray: ");
        for(int i=start; i<=end; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
