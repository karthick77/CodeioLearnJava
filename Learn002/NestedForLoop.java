package Learn002;

public class NestedForLoop {
    public static void main(String[] args) {
//        for(int i=1; i<=3; i++){
//            System.out.print(i+"  - \t");
//            for(int j=1; j<8; j++){
//                System.out.print(j+"\t");
//            }
//            System.out.println();
//        }

        for(int i=3; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=3; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
