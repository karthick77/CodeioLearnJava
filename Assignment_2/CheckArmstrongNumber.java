package Assignment_2;

public class CheckArmstrongNumber {

    public static void main(String[] args) {

        int num = 153, arm=0, reminder=0;
        int originalNum = num;

        while(num != 0){
            reminder = num%10;
            arm = arm + (reminder * reminder * reminder);
            num /= 10;
        }

        if(originalNum == arm){
            System.out.println(originalNum +" is armstrong number");
        }else{
            System.out.println(originalNum +" is not a armstrong number");
        }
    }
}
