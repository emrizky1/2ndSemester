import java.util.Scanner;

public class UpdStudentDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Student input: ");
        int sInput = sc.nextInt();
        sc.nextLine();

        TopStudent20 topStudents = new TopStudent20(sInput);

        for (int i = 0; i < sInput; i++) {
            System.out.println("Enter student data " + (i + 1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Student class: ");
            String sClass = sc.nextLine();

            System.out.print("GPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine();

            Student20 student = new Student20(nim, name, sClass, gpa);
            topStudents.add(student);
        }

        System.out.println("Original student list:");
        topStudents.print();

        topStudents.bubbleSort();
        System.out.println("Sorted student list (by GPA, descending):");
        topStudents.print();

        topStudents.selectionSort();
        System.out.println("Sorted student list (by GPA, ascending) using selection sort:");
        topStudents.print();

        topStudents.insertionSort();
        System.out.println(":Sorted student list (by GPA, ascending) using insertion sort:");
        topStudents.print();
    }
}
