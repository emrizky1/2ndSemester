public class Lecturer20 {
    String lecturerID;
    String name;
    boolean status;
    int startYear;
    String expertiseField;

    public Lecturer20() {

    }

    public Lecturer20(String id, String name, boolean stat, int bgYear, String field) {
        lecturerID = id;
        this.name = name;
        status = stat;
        startYear = bgYear;
        expertiseField = field;
    }

    void print() {
        System.out.println("Lecturer ID: " + lecturerID);
        System.out.println("Name: " + name);
        System.out.println("Active: " + status);
        System.out.println("Year Start: " + startYear);
        System.out.println("Expertise Field: " + expertiseField);
    }

    void setStatus(boolean status) {
        this.status = status;
    }

    void calculateTenure(int yearNow) {
        startYear = yearNow;
    }

    void changeExpertiseField(String newField) {
        expertiseField = newField;
    }
}
