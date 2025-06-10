public class Student20 {
    String nim, name, className;
    double ipk;

    public Student20() {

    }
    
    public Student20(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        className = kls;
        ipk = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + ipk);
    }
}