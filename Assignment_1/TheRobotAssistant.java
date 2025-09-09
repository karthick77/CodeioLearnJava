package Assignment_1;

public class TheRobotAssistant {

    /*
       A scientist built a robot that performs basic operations.
       Input Format:
       • First line: two integers a and b
       • Second line: an integer op representing the operation
       o 1 → Addition
       o 2 → Subtraction
       o 3 → Multiplication
       o 4 → Division
       Output Format: Print the result of the operation
     */
    public static void main(String[] args) {

        int[] cal = {1, 3, 4, 2};
        int[] firstOperand = {10, 17, 20, 6};
        int[] secondOperand = {5, 9, 4, 2};

        int count = firstOperand.length;

        for(int i=0; i<count; i++){
            if(cal[i] == 1){
                System.out.println("Addition of two numbers: "+(firstOperand[i]+secondOperand[i]));
            } else if (cal[i] == 2) {
                System.out.println("Subtraction of two numbers: "+(firstOperand[i]-secondOperand[i]));
            } else if (cal[i] == 3) {
                System.out.println("Multiplication of two numbers: "+(firstOperand[i]*secondOperand[i]));
            } else if (cal[i] == 4) {
                System.out.println("Division of two numbers: "+(firstOperand[i]/secondOperand[i]));
            } else {
                System.out.println("Please enter valid operation ");
            }
        }
    }
}
