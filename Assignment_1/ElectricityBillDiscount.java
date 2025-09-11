package Assignment_1;

public class ElectricityBillDiscount {

    public static void main(String[] args) {

        float[] electricityBill = {1200, 1001, 1000, 999, 501, 500, 499 };
        float finalAmt = 0;

        for(int i=0; i<electricityBill.length; i++) {
            if (electricityBill[i] > 1000) {
                System.out.print("10% discount is applicable for you \n");
                finalAmt = electricityBill[i] - ((electricityBill[i] * 10)/100);
                System.out.println("Actual amount is:"+electricityBill[i]+" Payable amount after discount is: " + finalAmt);
            } else if (electricityBill[i] <= 1000 && electricityBill[i] >= 500) {
                System.out.print("5% discount is applicable for you \n");
                finalAmt = electricityBill[i] - ((electricityBill[i] * 5)/100);
                System.out.println("Actual amount is:"+electricityBill[i]+" Payable amount after discount is: " + finalAmt);
            } else {
                System.out.print("0% discount is applicable for you \n");
                finalAmt = electricityBill[i];
                System.out.println("Payable amount is: " + finalAmt);
            }
        }
    }
}
