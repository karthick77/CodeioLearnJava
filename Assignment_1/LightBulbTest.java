package Assignment_1;

public class LightBulbTest {

    /*
        Required:
        Ramesh bought a smart light bulb that switches ON only if he enters an even number,
        otherwise it stays OFF
     */
    public static void main(String[] args) {

        //--- Input from array
        int[] inputValues = {4, 7, 0, -1, -2};
        //--- % of 2 is used to find given number is even or odd
        for(int i=0; i<inputValues.length; i++){
            if(inputValues[i] % 2 ==0){
                System.out.println("For input "+inputValues[i]+" light bulb is \"ON\"");
            }else{
                System.out.println("For input "+inputValues[i]+" light bulb is \"OFF\"");
            }
        }
    }
}
