package Assignment_3;

public class Employee {

    private  String name;
    private int id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.id = 777;
        emp1.name = "ram";
        emp1.salary = 78945d;
        System.out.println("Employee ID: "+emp1.getId() +" Name: "+ emp1.getName() + " Salary: "+emp1.getSalary());

        Employee emp2 = new Employee();
        emp2.id = 1077;
        emp2.name = "sam";
        emp2.salary = 74500d;
        System.out.println("Employee ID: "+emp2.getId() +" Name: "+ emp2.getName() + " Salary: "+emp2.getSalary());

    }
}
