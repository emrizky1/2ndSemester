public class Student {
    String nim, name, className;
    double gpa;

    public Student(){

    }

    public Student(String nm, String nama, String kelas, double ip) {
        nim = nm;
        name = nama;
        className = kelas;
        gpa = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + gpa);
    }
}