package Learn004;

public class TVRemote extends Remote{

    void action(){
        System.out.println("TV Remote On");
    }
    public static void main(String[] args) {
       TVRemote tv = new TVRemote();
       tv.action();
    }
}
