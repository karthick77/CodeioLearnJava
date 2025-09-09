package Assignment_1;

public class TheMagicCalendar {

    /*
     Requirement: A kingdom celebrates a festival only in leap years.
     */
    public static void main(String[] args) {

        int[] year = {2020, 1901, 2000, 2012, 1999};
        /* To find leap year - use % of 4 with given year
           if % of 4 is zero than given year is leap year
         */
        for(int i=0; i<year.length; i++){
            if(year[i]%4 == 0){
                if(year[i]%400 == 0 || year[i]%100 !=0){
                    System.out.println("Given year "+year[i]+" is a Leap year");
                }
            }else{
                System.out.println("Given year "+year[i]+" is not a Leap year");
            }

        }

    }
}
