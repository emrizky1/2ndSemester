import java.util.Scanner;

public class StudentDemo20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;

        StudentAssignmentStack20 stack = new StudentAssignmentStack20(5);
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan tugas");
            System.out.println("2. Menilai tugas");
            System.out.println("3. Melihat tugas teratas");
            System.out.println("4. Melihat daftar tugas");
            System.out.print("Pilih: ");
            choice = scan.nextInt();
            scan.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Student20 std = new Student20(nim, nama, kelas);
                    stack.push(std);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", std.name);
                    break;
                
                case 2:
                    Student20 grade = stack.pop();
                    if (grade != null) {
                        System.out.println("Menilai tugas dari " + grade.name);
                        System.out.println("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        grade.grading(nilai);
                        System.out.printf("Tugas %s berhasil dinilai dengan nilai %d\n", grade.name, grade.grade);
                        String binary = stack.convertToBinary(nilai);
                        System.out.printf("Assignment grade in binary is %s\n", binary);
                        break;
                    }
                
                case 3:
                    Student20 peek = stack.peek();
                    if (peek != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + peek.name);
                    }
                    break;
                
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIm\tKelas");
                    stack.print();
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        }while (choice <= 4 && choice > 0);
    } 
}