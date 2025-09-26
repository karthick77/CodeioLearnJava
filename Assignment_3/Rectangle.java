package Assignment_3;

public class Rectangle {

   private float recLength;
   private float recBreadth;

    public Rectangle(float recLen, float recBre) {
        this.recLength = recLen;
        this.recBreadth = recBre;
    }

    float area(){

        return recLength*recBreadth ;
    }

    float perimeter(){

        return 2*(recLength+recBreadth);
    }

    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: "+rec1.area()+" - Perimeter of Rectangle: "+rec1.perimeter());

        Rectangle rec2 = new Rectangle(11, 17);
        System.out.println("Area of Rectangle: "+rec2.area()+" - Perimeter of Rectangle: "+rec2.perimeter());
    }
}
