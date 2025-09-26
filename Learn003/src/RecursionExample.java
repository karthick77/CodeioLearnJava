public class RecursionExample {

    /* Recursion: A function calling itself
       1. Base Condition
       2. Recursive Call
       3. Updation
    */

    static int nToOne(int n){
        if(n<0){
            return -1;
        }
        if(n==1 || n==0)
            return 1; // Base Condition
        System.out.println(n);
        return nToOne(n-1); // Recursive Call
    }

    static int OneToN(int n, int start){
        if(start>n){
            return  -1;
        }
        if(n == start){
            return n;
        }
        if(n>=start){
            System.out.println(start);
            return OneToN(n, start+1);
        }

        return  1;
    }

    static String add(int a, int b){
        return "Sum: "+(a+b);
    }
    public static void main(String[] args) {
        //System.out.println(nToOne(7));
        //System.out.println(add(5,12));
        System.out.println(OneToN(5,1));
    }

}
