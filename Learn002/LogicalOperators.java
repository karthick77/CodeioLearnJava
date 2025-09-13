package Learn002;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        System.out.println("a && b = "+(a && b));
        System.out.println("a || b = "+(a || b));
        System.out.println("!a = "+(!a));
        System.out.println("!b = "+(!b));

        int x=10, y=20;
        boolean result = (x < y) && (x > 5);
        System.out.println(result);

        int age = 17;
        char gender = 'M';

        if(age > 18 && gender == 'F'){
            System.out.println("And short circuit");
        }else if(age > 18 || gender == 'F'){
            System.out.println("OR short circuit");
        }else{
            System.out.println("No short circuit");
        }

    }
}
