package Assignment_2;

public class CountOfOccurence {

    public static void main(String[] args) {

        int[] arr = {2, 4, 2, 6, 2, 9, 6};
        int[] target = {2,4,6,9};
        for(int i=0; i<target.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] == target[i]){
                    count++;
                }
            }
            System.out.println(target[i]+" appears "+count+" times");
        }


    }
}
