public class LecturerMain {
    public static void main(String[] args) {
        Lecturer20 lecturer1 = new Lecturer20();
        lecturer1.lecturerID = "201";
        lecturer1.name = "Jaka";
        lecturer1.status = true;
        lecturer1.startYear = 2010;
        lecturer1.expertiseField = "Programming";
        lecturer1.print();
        lecturer1.setStatus(false);
        lecturer1.calculateTenure(2012);
        lecturer1.changeExpertiseField("Business");
        lecturer1.print();

        Lecturer20 lecturer2 = new Lecturer20("202", "Juki", true, 2012, "English");
        lecturer2.print();
    }
}
