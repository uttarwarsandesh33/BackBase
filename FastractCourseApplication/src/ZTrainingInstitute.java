import java.util.ArrayList;
import java.util.Date;

public class ZTrainingInstitute {
    public static void main(String[] args) {

        Student s1 = new Student(100,"Sandesh","BE EnTC" );
        Student s2 = new Student(101,"Rohit","BE IT" );
        Student s3 = new Student(102,"Siddu","BE Comp" );
        Student s4 = new Student(100,"Sumeet","BE Comp" );

        ArrayList<Student> studList = new ArrayList<Student>();
        studList.add(s1);
        studList.add(s2);
        studList.add(s3);
        studList.add(s4);
        JavaCourse jv = new JavaCourse(12,"Java",3,"Sheetal B. Madake", new Date(2017,8,16), new Date(2017,9,16),studList);
        jv.displayCourseDetails();
    }
}
