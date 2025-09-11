package Assignment_1;

public class PassOrFailInExam {

    public static void main(String[] args) {

        int[] marks = {50, 51, 49, 35, 87, 92, 102};

        for(int i=0; i<marks.length; i++){
            if(marks[i] <= 100){
                if(marks[i] >= 50){
                    System.out.println("Your marks is: "+marks[i]+" and your Pass");
                }else{
                    System.out.println("Your marks is: "+marks[i]+" and your Fail");
                }
            }else{
                System.out.println("Please enter valid marks");
            }

        }
    }
}
