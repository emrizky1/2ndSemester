public class Lecturer20 {
    String id;
    String name;
    boolean gender;
    int age;

    public Lecturer20() {

    }

    public Lecturer20(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void print() {
        System.out.println("ID: " + id + ", Name: " + name + ", Gender: " + gender + ", Age: " + age);
    }
}
