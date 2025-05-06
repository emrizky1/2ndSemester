import java.util.Scanner;

public class ExcuseLetterDemo20 {
    public static void main(String[] args) {
        ExcuseLetterStack20 stack = new ExcuseLetterStack20(10);
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter by Name");
            System.out.println("5. Exit");
            System.out.print("Choose a menu: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = scan.nextLine();
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Class Name: ");
                    String cls = scan.nextLine();
                    System.out.print("Type of Excuse (S/I): ");
                    char type = scan.nextLine().charAt(0);
                    System.out.print("Duration (days): ");
                    int duration = scan.nextInt();
                    scan.nextLine();

                    stack.push(new ExcuseLetter20(id, name, cls, type, duration));
                    System.out.println("Excuse letter submitted.\n");
                    break;
                case 2:
                    ExcuseLetter20 processed = stack.pop();
                    if (processed != null) {
                        System.out.println("Processing letter from " + processed.name);
                    }
                    break;
                case 3:
                    ExcuseLetter20 top = stack.peek();
                    if (top != null) {
                        System.out.println("Latest letter from: " + top.name);
                    }
                    break;
                case 4:
                    System.out.print("Enter name to search: ");
                    String searchName = scan.nextLine();
                    ExcuseLetter20 result = stack.searchByName(searchName);
                    if (result != null) {
                        System.out.println("Letter found from " + result.name + " for " + result.duration + " day(s)");
                    } else {
                        System.out.println("Letter not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        scan.close();
    }
}
