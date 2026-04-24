import java.util.*;

public class StudentInfro {
    public static void main(String []args){
       System.out.println("Please enter your ID");
       Scanner input=new Scanner(System.in);
        int stdid=input.nextInt();

        System.out.println("Please enter your faculty-ID");
        int facultyId=input.nextInt();
        System.out.println("Please enter your Semester");
        int semester=input.nextInt();
        System.out.println("Please enter your course-ID");
        int courseId=input.nextInt();
        System.out.println("Please enter your Marks");
        int marks=input.nextInt();

    System.out.println("Student ID: "+stdid);
    System.out.println("Faculty ID: "+facultyId);
    System.out.println("Semester: "+semester);
    System.out.println("Course ID: "+courseId);
    System.out.println("Marks: "+marks);
    }
}