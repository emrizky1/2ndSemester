import java.util.Scanner;

public class newMain {
    public static void main(String[] args) {
        StudentQueue queue = new StudentQueue();
        Scanner sc = new Scanner(System.in);
        int opt;

        do {
            System.out.println("\n--- Student Service Queue ---");
            System.out.println("1. Enqueue student");
            System.out.println("2. Dequeue student");
            System.out.println("3. View queue");
            System.out.println("4. View front student");
            System.out.println("5. View rear student");
            System.out.println("6. Total in queue");
            System.out.println("7. Clear queue");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            opt = sc.nextInt(); 
            sc.nextLine();

            switch (opt) {
                case 1:
                    System.out.print("Enter NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Class: ");
                    String kelas = sc.nextLine();

                    NStudent student = new NStudent(nim, name, kelas);
                    queue.enqueue(student);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.printQueue();
                    break;

                case 4:
                    queue.printFront();
                    break;

                case 5:
                    queue.printRear();
                    break;

                case 6:
                    System.out.println("Total in queue: " + queue.total());
                    break;

                case 7:
                    queue.clear();
                    break;

                case 0:
                    System.out.println("Thank you");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (opt != 0);

        sc.close();
    }
}
