package Learn004;
class Human{

    int age;

    public Human(int age) {
        this.age = age;
    }

    void speak(){
        System.out.println("I am Human");
    }
}

public class Student extends Human{

    String name;

    public Student(int age, String name) {
        super(age);
        this.name = name;
    }

    void display(){
        System.out.println(name+"-"+age);
    }

    public static void main(String[] args) {
        Student s1 = new Student(29,"A11");
        s1.display();
    }
}
