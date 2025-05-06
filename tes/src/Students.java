public class Students {
    String studentID;
    String studentName;
    String studentCourse;

    public Students(String studentID, String studentName, String studentCourse) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentCourse = studentCourse;
    }

    public void printStudents() {
        System.out.println("\n=========== Students Data ===========");
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Major: " + studentCourse);
    }
}
