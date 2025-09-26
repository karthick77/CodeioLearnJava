public class AgeCalculator {

    // block scope
    static {
        int c = 30;
        System.out.println("Block Scope: "+c);
    }
    // Getting value in method is called as Parameters
    static  String ageCalculator(String name, int year){
        int age = 25; // declaration + init
        return name+" and age is: "+(2025-year);
    }

    public static void main(String[] args) {
        // Arguments when call a function
        System.out.println(ageCalculator("Goms", 2000));
        System.out.println(ageCalculator("Karthick", 1990));

        int i=0;
        for(i=0; i<5; i++){

        }
        System.out.println("Value of i is: "+i);

    }
}
