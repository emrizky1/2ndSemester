import java.util.Scanner;

public class LecturerDemo20 {
    public static void main(String[] args) {
        Lecturer20[] LecturerArray = new Lecturer20[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 1; i++) {
            int age;
            String id, name, gdr;
            boolean gender = true;

            System.out.println("Enter Lecturer Data " + (i + 1));
            System.out.print("ID: ");
            id = input.nextLine();
            System.out.print("Name: ");
            name = input.nextLine();
            System.out.print("Age: ");
            age = input.nextInt();
            input.nextLine();
            System.out.print("Gender: ");
            gdr = input.nextLine();
            
            if (gdr.equalsIgnoreCase("female")) {
                gender = false;
            }
            LecturerArray[i] = new Lecturer20(id, name, age, gender);
        }
        
        LecturerData20 LecturerData = new LecturerData20();
        LecturerData.showLecturerData(LecturerArray);
        LecturerData.countLecturerByGender(LecturerArray);
        LecturerData.averageLecturerAgeByGender(LecturerArray);
        LecturerData.showOldestLecturerInfo(LecturerArray);
        LecturerData.showYoungestLecturerInfo(LecturerArray);

        input.close();
    }
}
