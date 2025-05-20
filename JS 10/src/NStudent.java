public class NStudent {
    String nim;
    String name;
    String kelas;

    public NStudent() {

    }

    public NStudent(String nim, String name, String kelas) {
        this.nim = nim;
        this.name = name;
        this.kelas = kelas;
    }

    public void print() {
        System.out.println(nim + " - " + name + " - " + kelas);
    }
}
