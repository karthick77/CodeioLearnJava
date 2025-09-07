package Learn001;

public class SumAllElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int total = 0; //to provide result after add all values in array
        System.out.println("Length of an given array: "+arr.length);
        //for loop is used to iterate each values inside an array
        for(int i=0; i<arr.length; i++){
          total = total + arr[i];
        }
        System.out.println("Sum of all elements in given array: "+ total);
    }
}
