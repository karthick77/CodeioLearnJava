package Assignment_1;

public class TheReportCard {

    /*
     A school teacher wants to prepare a report card generator.
     Input Format: An integer marks (0–100)
     Output Format: "A" if marks >= 90, "B" if marks >= 75 and < 90,
     "C" if marks >= 50 and < 75, Fail" if marks < 50
    */
    public static void main(String[] args) {

        int[] marks = {92, 76, 45, 90, 75, 50};
        for(int i=0; i<marks.length; i++){
            if(marks[i] >= 90){
                System.out.println("Mark scored: "+marks[i]+" and Grade is: A");
            } else if (marks[i]>=75 && marks[i]<90) {
                System.out.println("Mark scored: "+marks[i]+" and Grade is: B");
            } else if (marks[i]>=50 && marks[i]<75) {
                System.out.println("Mark scored: "+marks[i]+" and Grade is: c");
            } else{
                System.out.println("Mark scored: "+marks[i]+" and Grade is: Fail");
            }
        }
    }
}
