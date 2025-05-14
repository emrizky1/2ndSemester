import java.util.Scanner;

public class KRSQueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KRSQueue queue = new KRSQueue(10);
        int choice;

        do {
            System.out.println("\n===== KRS Approval Queue =====");
            System.out.println("1. Enqueue Student");
            System.out.println("2. Process 2 Students (Dequeue)");
            System.out.println("3. Show All Students");
            System.out.println("4. Show First Two Students");
            System.out.println("5. Show Last Student");
            System.out.println("6. Show Queue Stats");
            System.out.println("7. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Choose menu: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Study Program: ");
                    String prog = sc.nextLine();
                    System.out.print("Class: ");
                    String className = sc.nextLine();
                    Student s = new Student(nim, name, prog, className);
                    queue.enqueue(s);
                    break;
                case 2:
                    queue.processKRSApproval();
                    break;
                case 3:
                    queue.showAll();
                    break;
                case 4:
                    queue.showFirstTwo();
                    break;
                case 5:
                    queue.showLast();
                    break;
                case 6:
                    queue.showStats();
                    break;
                case 7:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 0);
    }
}
