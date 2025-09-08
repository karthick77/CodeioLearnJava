package Assignment_1;

public class TheBankBalance {

    /*
        Requirement:
        A bank system needs to show the status of a customer’s account balance.
     */
    public static void main(String[] args) {

        int[] balance = {250, 0, -120};
        // Get balance input from array and based on that display the result
        for(int i=0; i<balance.length; i++){
            if(balance[i]==0){
                System.out.println("Account balance have "+balance[i]+" so result is \"Zero Balance\" ");
            } else if (balance[i] > 0) {
                System.out.println("Account balance have "+balance[i]+" so result is \"Positive Balance\" ");
            } else {
                System.out.println("Account balance have "+balance[i]+" so result is \"Overdraft Balance\" ");;
            }
        }
    }
}
