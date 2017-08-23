import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class JavaCourse {

    private int courseId;
    private String courseName;
    private int duration;
    private String facultyName;
    private Date startDate;
    private Date endDate;
    private ArrayList<Student> studentsList;

    public JavaCourse(){

    }

    public JavaCourse(int courseId,String courseName, int duration, String facultyName, Date startDate, Date endDate, ArrayList<Student> studentsList){
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
        this.facultyName = facultyName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.studentsList = studentsList;
    }

    public void addStudent(){
        Student newStudent = new Student(100,"Rohit","MCA");
        this.studentsList.add(newStudent);
    }

    public void addStudent(Student student){
        this.studentsList.add(student);
    }

    public void displayCourseDetails(){
        System.out.println("Course Details are - ");

//        try {
//            String startDateString = "06/12/2017";
//            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
//            Date startDate = df.parse(startDateString);
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
        System.out.println("Course Id - " + this.courseId+" Course Name - "+ this.courseName+" Duration - "+this.duration+" Faculty Name - "+ this.facultyName+" Start Data - "+this.startDate+" End Date - "+this.endDate );
        System.out.println("Student Details are - ");
        for(Student s: this.studentsList){
            s.displayStudentDetails();
        }
    }

}
