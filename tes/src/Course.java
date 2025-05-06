public class Course {
    String CourseCode;
    String CourseName;
    int sks;

    public Course() {

    }

    public Course(String CourseCode, String CourseName, int sks) {
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
        this.sks = sks;
    }

    public void printMajor() {
        System.out.println("Course Code: " + CourseCode + "Course Name: " + CourseName + "SKS: " + sks);
    }
}