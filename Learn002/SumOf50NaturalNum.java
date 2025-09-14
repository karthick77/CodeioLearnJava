package Learn002;

public class SumOf50NaturalNum {
    public static void main(String[] args) {

        int num = 50;
        int total = 0;
        int i = 1;
        while (i <= num){
            total = total + i;
            i++;
        }
        System.out.println(total);
    }
}
