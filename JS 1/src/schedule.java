import java.util.Scanner;

public class schedule {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String[] cName = new String[100];
        int[] sks = new int[100];
        int[] semester = new int[100];
        String[] lDay = new String[100];
        int courseCount = 0;

        while (true) {
            System.out.println("=== Main Menu ===");
            System.out.println("1. Add Course");
            System.out.println("2. Display all courses.");
            System.out.println("3. Display courses based on the day.");
            System.out.println("4. Display courses based on the semester.");
            System.out.println("5. Search for a course.");
            System.out.println("6. Exit.");
            System.out.print("Choose option: ");
            int opt = input.nextInt();
            input.nextLine();
    
            switch(opt) {
                case 1:
                courseCount = addCourse(cName, sks, semester, lDay, input, courseCount);
                break;

                case 2:
                allCourses(cName, sks, semester, lDay, courseCount);
                break;
    
                case 3:
                sDay(cName, lDay, input, courseCount);
                break;
    
                case 4:
                sSemester(cName, semester, input, courseCount);
                break;
    
                case 5:
                dCourse(cName, sks, semester, lDay, input, courseCount);
                break;

                case 6:
                System.out.println("Thank you for using our service!");
                input.close();
                return;
    
                default:
                System.out.println("Invalid option. Try again!");
    
            }
        }
    
    }

    public static int addCourse(String[] cName, int[] sks, int[] semester, String[] lDay, Scanner input, int courseCount) {
        if (courseCount < 100) {
            System.out.print("Enter course name: ");
            cName[courseCount] = input.nextLine();
            System.out.print("Enter SKS: ");
            sks[courseCount] = input.nextInt();
            System.out.print("Enter semester: ");
            semester[courseCount] = input.nextInt();
            input.nextLine();
            System.out.print("Enter day: ");
            lDay[courseCount] = input.nextLine();
            courseCount++;
            System.out.println("Course added successfully.");
            System.out.println();
        } else {
            System.out.println("Error! data quantity maxed out.");
        }
        return courseCount;
    } 

    public static void allCourses(String[] cName, int[] sks, int[] semester, String[] lDay, int courseCount) {
        System.out.println();
        for (int i = 0; i < courseCount; i++) {
            System.out.printf("Course Name: %s\nSKS: %d\nSemester: %d\nDay: %s\n", cName[i], sks[i], semester[i], lDay[i]);
            System.out.println();
        }
    }

    public static void sDay(String[] cName, String[] lDay, Scanner input, int courseCount) {
        String day;
        boolean dayCheck = false;

        System.out.print("Please enter the day: ");
        day = input.nextLine();

        System.out.println(day + "'s courses are: ");
        for (int i = 0; i < courseCount; i++) {
            if (day.equalsIgnoreCase(lDay[i])) {
                System.out.println("* " + cName[i]);
                dayCheck = true;
                System.out.println();
            }
        }

        if (!dayCheck) {
            System.out.println("No courses available on that day.");
            System.out.println();
        }
    }

    public static void sSemester(String[] cName, int[] semester, Scanner input, int courseCount) {
        int smt;
        boolean smtCheck = false;

        System.out.print("Please enter the semester: ");
        smt = input.nextInt();

        System.out.println("Semester " + smt + "'s courses are: ");

        for (int i = 0; i < courseCount; i++) {
            if (smt == semester[i]) {
                System.out.println("* " + cName[i]);
                smtCheck = true;
                System.out.println();
            }
        }

        if (!smtCheck) {
            System.out.println("No courses available on that semester.");
            System.out.println();
        }
    }

    public static void dCourse(String[] cName, int[] sks, int[] semester, String[] lDay, Scanner input, int courseCount) {
        String course;
        boolean courseCheck = false;

        System.out.print("Please enter the course name: ");
        course = input.nextLine();

        for (int i = 0; i < courseCount; i++) {
            if (course.equalsIgnoreCase(cName[i])) {
                System.out.println("Course name: " + cName[i]);
                System.out.println("Credit hours: " + sks[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Lecture day: " + lDay[i]);
                courseCheck = true;
                System.out.println();
            }
        }

        if (!courseCheck) {
            System.out.println("Invalid input.");
            System.out.println();
        }
    }
}
