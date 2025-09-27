package Learn004;

public class ACRemote extends RemoteA{

    String brandAC;

    public ACRemote(int frequency, String brandAC) {
        super(frequency);
        this.brandAC = brandAC;
    }

    void acRemote(){
        System.out.println("Frequency is: "+frequency+" AC Brand: "+brandAC);
    }

    public static void main(String[] args) {
        ACRemote ac1 = new ACRemote(125, "Voltas");
        ac1.acRemote();

        ACRemote ac2 = new ACRemote(135, "Daikin");
        ac2.acRemote();
    }
}
