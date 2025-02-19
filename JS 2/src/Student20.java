public class Student20 {
    String studentID;
    String name;
    String className;
    double gpa;

    public Student20() {
    
    }

    public Student20(String id, String name, String cls, double gpa) {
        studentID = id;
        this.name = name;
        className = cls;
        this.gpa = gpa;
    }

    void print() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
        System.out.println("GPA: " + gpa);
    }

    void changeClass(String newClass) {
        className = newClass;
    }

    void updateGPA(double newGpa) {
        if (gpa > 4.0 || gpa < 0.0) {
            System.out.println("Invalid IPK. Must be between 0.0 and 4.0");
        } else {
            gpa = newGpa;
        }
    }

    String evaluate() {
        if (gpa >= 3.5) {
            return "Excellent";
        } else if (gpa >= 3.0) {
            return "Good";
        } else if (gpa >= 2.0) {
            return "Fair";
        } else {
            return "Poor";
        }
    }
}