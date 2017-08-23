import java.rmi.StubNotFoundException;

public class Student {
    private int enrollmentId;
    private String name;
    private String qualification;

    public Student(){

    }

    public Student(int enrollmentId, String name, String qualification){
        this.enrollmentId = enrollmentId;
        this.name = name;
        this.qualification = qualification;
    }

    public void displayStudentDetails(){
        System.out.println("Enrollment ID - " + this.enrollmentId + "\tName - "+this.name + "\tQualification "+ this.qualification);
    }
}
