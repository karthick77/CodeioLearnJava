package Learn001;

public class LargestElementInArray {

    public static void main(String[] args) {
        int[] arr = {12, 27, 1, 5, 77, 21, 4, 3, 99, 22};
        int maxValue = arr[0]; //considering first element is largest
        for(int i=0; i<arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        System.out.println("Largest value: "+maxValue);
    }

}
