import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class Student {
    String StudentId;
    String StudentName;
    int StudentRollNumber;


    Student(String studentId, String studentName, int studentRollNumber){
        this.StudentName = studentName;
        this.StudentId = studentId;
        this.StudentRollNumber = studentRollNumber;
    }
}

public class Course {

    String CourseName;
    String CourseId;
    String CourseInstructor;

    static int MaxStudentCapacity = 0;
    int currentStudentCount = 0;

    Student[] EnrolledStudents;

    Course(String courseName, String courseId, String courseInstructor){
        this.CourseName = courseName;
        this.CourseId = courseId;
        this.CourseInstructor = courseInstructor;


    }


    static {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Maximum Capacity for Course: ");
        Course.MaxStudentCapacity = userInput.nextInt();
    }
    {
        this.EnrolledStudents = new Student[Course.MaxStudentCapacity];
    }

    public void setEnrolledStudents(String studentName, String studentId, int studentRollNumber){
        if (currentStudentCount < MaxStudentCapacity) {
            this.EnrolledStudents[currentStudentCount] = new Student(studentId, studentName, studentRollNumber);
            currentStudentCount++;
        } else {
            System.out.println("The course is full. Cannot enroll more students.");
        }
    }

    public void unEnrolledStudent(String studentName){
        for (int i = 0; i < this.EnrolledStudents.length; i++) {
            if (EnrolledStudents[i] != null && Objects.equals(EnrolledStudents[i].StudentName, studentName)){
                EnrolledStudents[i] = null;
                System.out.println("Student " + studentName + " has been unenrolled.");
                return;
            }
        }
        System.out.println("Student " + studentName + " not found.");
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + CourseName);
        System.out.println("Course ID: " + CourseId);
        System.out.println("Instructor: " + CourseInstructor);
        System.out.println("Enrolled Students:");
        for (int i = 0; i < this.EnrolledStudents.length; i++) {
            if (EnrolledStudents[i] != null){
            System.out.println(
                    "Student{" +
                            "StudentId='" + this.EnrolledStudents[i].StudentId + '\'' +
                            ", StudentName='" + this.EnrolledStudents[i].StudentName + '\'' +
                            ", StudentRollNumber=" + this.EnrolledStudents[i].StudentRollNumber +
                            '}'
            );
            }
        }
    }

    public static void main(String[] args) {
        // Create a course and enroll students
        Course MyCourse_1 = new Course("Computer Science", "27026", "Muhammad Arham Jamil");

        MyCourse_1.setEnrolledStudents("Ahmed", "abc0", 0);
        MyCourse_1.setEnrolledStudents("Sarim", "abc1", 1);
        MyCourse_1.setEnrolledStudents("Ibrahim", "abc2", 2);

        // Display course details
        MyCourse_1.displayCourseDetails();

        MyCourse_1.unEnrolledStudent("Ahmed");
        MyCourse_1.displayCourseDetails();
    }


}
