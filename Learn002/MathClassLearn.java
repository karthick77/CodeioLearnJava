package Learn002;

public class MathClassLearn {

    public static void main(String[] args) {

        //1. dice
        double random = Math.random();
        int v = (int)(random * 6)+1;
        System.out.println("your dice choice is: "+v);

        //2. OTP with 6 digits
        double otp = Math.random();
        int otpGenerated = (int)(otp*900000)+100000;
        System.out.println(otpGenerated);

        //3. max,min
        int max = Math.max(5, 12);
        System.out.println("Maximum: "+max);

        int min = Math.min(5, 12);
        System.out.println("Minimum: "+min);

        //4. sqrt
        int sqrt = (int)Math.sqrt(64);
        System.out.println(sqrt);

        int sqrt1 = (int)Math.sqrt(45);
        System.out.println(sqrt1);

        //5. Implicit: Smaller to Larger types
        int a = 10;
        double b = a;
        System.out.println("Before Implicit: "+a);
        System.out.println("After Implicit: "+b);

        //6. Explicit: Larger to Smaller types
        // incompatible types - possible lossy conversion from double to int
        double c = 10.6;
        int d = (int)c;
        System.out.println("Before Explicit: "+c);
        System.out.println("After Explicit: "+d);


    }
}
