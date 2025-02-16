import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nim;

        System.out.print("Please input your NIM: ");
        nim = sc.nextLine();
        int nimn = Integer.parseInt(nim.substring(nim.length() - 2));
        if (nimn < 10) {
            nimn += 10;
        }

        System.out.println("n: " + nimn);
        System.out.println("====================");

        for (int i = 1; i <= nimn; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
