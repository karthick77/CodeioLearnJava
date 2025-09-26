package Assignment_3;

public class Students {

    private String name;
    private Integer rollNumber;
    private Integer marks;

    public Students(String name, Integer rollNumber, Integer marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String displayStudentDetails(){

        return ("Name: "+name+" RollNumber: "+rollNumber+" Marks: "+marks);
    }

    static String displaySchoolName(){
        return "CodeIO";
    }

    public static void main(String[] args) {

        System.out.println(Students.displaySchoolName());
        Students s1 = new Students("Ram",11,98);
        System.out.println(s1.displayStudentDetails());
        Students s2 = new Students("Sam",12,93);
        System.out.println(s2.displayStudentDetails());
        Students s3 = new Students("Dom",13,92);
        System.out.println(s3.displayStudentDetails());
    }
}
