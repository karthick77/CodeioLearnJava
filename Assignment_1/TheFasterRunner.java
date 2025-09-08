package Assignment_1;

public class TheFasterRunner {

    /*
        Two friends, Arjun and Varun, run a race. Print who is faster.
     */
    public static void main(String[] args) {

        int[] arjunRaceTime =  {12, 15, 18};
        int[] varunRaceTime =  {10, 20, 18};

        int totalRace = arjunRaceTime.length;
        System.out.println("Total Race count: "+totalRace);
        for(int i=0; i<totalRace; i++){
            if(arjunRaceTime[i] > varunRaceTime[i]){
                System.out.print("Arjun's Time: "+arjunRaceTime[i]+"S\t");
                System.out.print("Varun's Time: "+varunRaceTime[i]+"S\t");
                System.out.print("Arjun is faster\n");
            } else if (arjunRaceTime[i] < varunRaceTime[i]) {
                System.out.print("Arjun's Time: "+arjunRaceTime[i]+"S\t");
                System.out.print("Varun's Time: "+varunRaceTime[i]+"S\t");
                System.out.print("Varun is faster\n");
            } else {
                System.out.print("Arjun's Time: "+arjunRaceTime[i]+"S\t");
                System.out.print("Varun's Time: "+varunRaceTime[i]+"S\t");
                System.out.print("Both are equal\n");
            }
        }
    }
}
