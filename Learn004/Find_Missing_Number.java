package Learn004;

public class Find_Missing_Number {

    static int findMissingNumber(int[] num){
        int actualTotal = 0;
        int arrLength = num.length+1;
        int expectedTotal = (arrLength * (arrLength+1))/2;
        for (int j : num) {
            actualTotal = actualTotal + j;
        }
        return expectedTotal-actualTotal;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,9};
        System.out.println(findMissingNumber(arr));
    }
}
