import java.util.Scanner;

public class LecturerDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lecturer input: ");
        int sInput = sc.nextInt();
        sc.nextLine();

        LecturerData20 lecturerData = new LecturerData20(sInput);

        for (int i = 0; i < sInput; i++) {
            System.out.println("Enter Lecturer data " + (i + 1));

            System.out.print("ID: ");
            String id = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            boolean gender = sc.nextBoolean();
            sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            Lecturer20 lecturer = new Lecturer20(id, name, gender, age);
            lecturerData.add(lecturer);
        }

        System.out.println("Original lecturer list:");
        lecturerData.print();

        lecturerData.bubbleSort();
        System.out.println("sorted lecturer list (age, ascending) by using bubble sort");
        lecturerData.print();

        lecturerData.selectionSort();
        System.out.println("Sorted lecturer list (age, descending) by using selection sort:");
        lecturerData.print();

        lecturerData.insertionSort();
        System.out.println("Sorted lecturer list (age, descending) by using insertion sort:");
        lecturerData.print();

        lecturerData.bubbleSort();

        System.out.println("__________________");
        System.out.println("__________________");
        System.out.print("Search lecturer by Lecturer's name: ");
        String search = sc.nextLine();
        System.out.println("Using sequential search");
        int position = lecturerData.findSeqSearch(search);

        lecturerData.showPosition(search, position);
        lecturerData.showData(search, position);

        System.out.print("Search lecturer by Lecturer's age: ");
        int searchl = sc.nextInt();
        System.out.println("Using binary search");
        int positionl = lecturerData.findBinarySearch(searchl, 0, sInput - 1);

        lecturerData.showPosition(search, positionl);
        lecturerData.showData(search, positionl);

    }
}
