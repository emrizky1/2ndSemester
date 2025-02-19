public class CourseMain {
    public static void main (String[] args) {
        Course20 course1 = new Course20();
        course1.courseID = "101";
        course1.name = "Pancasila";
        course1.credit = 2;
        course1.hour = 2;
        course1.print();
        course1.changeCredit(4);
        course1.addHour(4);
        course1.print();
        course1.reduceHour(2);
        course1.print();

        Course20 course2 = new Course20("102", "Daspro", 5, 3);
        course2.print();
    }
}
