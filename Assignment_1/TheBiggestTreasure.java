package Assignment_1;

import java.util.Arrays;

public class TheBiggestTreasure {
    /*
       Three pirates find three treasure chests with different amounts of gold coins.
     */
    public static void main(String[] args) {

        int[] tresureSet1 = {10, 25, 7};
        int[] tresureSet2 = {5, 5, 9};
        int[] tresureSet3 = {100, 50, 75};
        //to find the largest gold coin treasure chest
        int numOfChests = tresureSet1.length;
        int maxValChest1 = tresureSet1[0];
        int maxValChest2 = tresureSet2[0];
        int maxValChest3 = tresureSet3[0];
        for(int i=1; i<numOfChests; i++){
            if(tresureSet1[i] > maxValChest1){
                maxValChest1 = tresureSet1[i];
            }
        }
        System.out.println("Max gold coin in chest for set 1 "+Arrays.toString(tresureSet1)+" is: "+maxValChest1);
        System.out.println("Max gold coin in chest for set 2 "+Arrays.toString(tresureSet2)+" is: "+maxValChest2);
        System.out.println("Max gold coin in chest for set 3 "+Arrays.toString(tresureSet3)+" is: "+maxValChest3);

    }
}
