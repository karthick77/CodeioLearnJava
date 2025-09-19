package Assignment_2;

public class PallindromeCheck {
    public static void main(String[] args) {

            int num = 1221, revNum = 0, reminder=0;
            int originalNumber = num;
            while(num != 0){
                reminder = num%10;
                revNum = (revNum*10)+reminder;
                num = num/10;
            }
            if(originalNumber == revNum){
                System.out.println(originalNumber + " is Palindrome.");
            }else{
                System.out.println(originalNumber + " is not Palindrome.");
            }
        }
}
