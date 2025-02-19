public class Course20 {
    String courseID;
    String name;
    int credit;
    int hour;

    public Course20() {

    }

    public Course20(String id, String name, int credit, int hour) {
        courseID = id;
        this.name = name;
        this.credit = credit;
        this.hour = hour;
    }

    void print() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Name: " + name);
        System.out.println("Credit: " + credit);
        System.out.println("Hour: " + hour);
    }

    void changeCredit(int newCredit) {
        credit = newCredit;
    }

    void addHour(int hour) {
        this.hour = hour;
    }

    void reduceHour(int hour) {
        this.hour = hour;
    }
}
