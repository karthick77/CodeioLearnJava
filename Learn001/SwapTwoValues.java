package Learn001;

public class SwapTwoValues {
    public static void main(String[] args) {
        int a = 12;
        int b = 15;

        System.out.println("Before Swap: a="+a+" b="+b);

        a=a+b; //27
        b=a-b; //12
        a=a-b; //15

        System.out.println("After Swap: a="+a+" b="+b);

    }
}
