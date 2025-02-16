import java.util.Scanner;

public class schedule {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String[] cName = {"Pancasila", "Mathematics", "Fundamental Programming", "Critical thinking"};
        int[] sks = {2, 3, 4, 3};
        int[] semester = {1, 2, 1, 2};
        String[] lDay = {"Monday", "Monday", "Friday", "Thursday"};

        System.out.println("=== Main Menu ===");
        System.out.println("1. Display all courses.");
        System.out.println("2. Display courses based on the day.");
        System.out.println("3. Display courses based on the semester.");
        System.out.println("4. Search for a course.");
        System.out.print("Choose option: ");
        int opt = input.nextInt();
        input.nextLine();

        switch(opt) {
            case 1:
            allCourses(cName, sks, semester, lDay);
            break;

            case 2:
            sDay(cName, lDay, input);
            break;

            case 3:
            sSemester(cName, semester, input);
            break;

            case 4:
            dCourse(cName, sks, semester, lDay, input);
            break;

            default:
            System.out.println("Invalid option. Try again!");

        }
        input.close();
    }

    public static void allCourses(String[] cName, int[] sks, int[] semester, String[] lDay) {
        System.out.println();
        for (int i = 0; i < cName.length; i++) {
            System.out.printf("Course Name: %s\nSKS: %d\nSemester: %d\nDay: %s\n", cName[i], sks[i], semester[i], lDay[i]);
            System.out.println();
        }
    }

    public static void sDay(String[] cName, String[] lDay, Scanner input) {
        String day;
        boolean dayCheck = false;

        System.out.print("Please enter the day: ");
        day = input.nextLine();

        System.out.println(day + "'s courses are: ");
        for (int i = 0; i < cName.length; i++) {
            if (day.equalsIgnoreCase(lDay[i])) {
                System.out.println("* " + cName[i]);
                dayCheck = true;
            }
        }

        if (!dayCheck) {
            System.out.println("No courses available on that day.");
        }
    }

    public static void sSemester(String[] cName, int[] semester, Scanner input) {
        int smt;
        boolean smtCheck = false;

        System.out.print("Please enter the semester: ");
        smt = input.nextInt();

        System.out.println("Semester " + smt + "'s courses are: ");

        for (int i = 0; i < cName.length; i++) {
            if (smt == semester[i]) {
                System.out.println("* " + cName[i]);
                smtCheck = true;
            }
        }

        if (!smtCheck) {
            System.out.println("No courses available on that semester.");
        }
    }

    public static void dCourse(String[] cName, int[] sks, int[] semester, String[] lDay, Scanner input) {
        String course;
        boolean courseCheck = false;

        System.out.print("Please enter the course name: ");
        course = input.nextLine();

        for (int i = 0; i < cName.length; i++) {
            if (course.equalsIgnoreCase(cName[i])) {
                System.out.println("Course name: " + cName[i]);
                System.out.println("Credit hours: " + sks[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Lecture day: " + lDay[i]);
                courseCheck = true;
            }
        }

        if (!courseCheck) {
            System.out.println("Invalid input.");
        }
    }
}
