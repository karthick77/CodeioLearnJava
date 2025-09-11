package Assignment_1;

public class SpeedLimitCheck {

    public static void main(String[] args) {
        int[] carSpeed = {60, 61, 40, 140, 59,120};
        int citySpeedLimit = 60;

        for(int i=0; i<carSpeed.length; i++){
            if(carSpeed[i]>60){
                System.out.print("Your car speed is: "+carSpeed[i]+" km/h \t");
                System.out.print("Overspeeding! Pay Fine\n");
            }else{
                System.out.print("Your car speed is: "+carSpeed[i]+" km/h \t");
                System.out.print("Your are within the speed limit\n");
            }
        }
    }
}
