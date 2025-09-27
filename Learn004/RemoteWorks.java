package Learn004;

class RemoteA{
    int frequency;

    public RemoteA(int frequency) {
        this.frequency = frequency;
    }

    void getFrequency(){
        System.out.println("Frequency is: "+frequency);
    }
}

public class RemoteWorks extends RemoteA {

    String brand;

    public RemoteWorks(int frequency, String brand) {
        super(frequency);
        this.brand = brand;
    }

    void tvRemote(){
        System.out.println("Frequency is: "+frequency+" Brand is: "+brand);
    }

    public static void main(String[] args) {
        RemoteWorks rw = new RemoteWorks(122, "Samsung");
        rw.getFrequency();//parent
        rw.tvRemote();//child
        RemoteWorks rw1 = new RemoteWorks(132, "LG");
        rw1.getFrequency();
        rw1.tvRemote();
    }
}


