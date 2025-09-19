package Assignment_2;

public class CountPositiveNegativeandZeroArray {

    public static void main(String[] args) {
        int arr[] = {5, -3, 0, 12, -9, 0, 7};
        int total = 0;
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        System.out.println("Total Count is: "+total);
    }
}
