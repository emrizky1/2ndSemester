import java.util.Scanner;

public class cubeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opt;
        int length;
        int vol = 0;
        int area = 0;
        int pmeter = 0;

        while (true) {
            System.out.println("===Selection Menu===");
            System.out.println("1. Calculate Volume");
            System.out.println("2. Calculate Surface Area");
            System.out.println("3. Calculate Perimeter");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            opt = input.nextInt();

            switch (opt) {
                case 1:
                System.out.print("Please input the length: ");
                length = input.nextInt();
                volCalc(length, vol);
                break;

                case 2:
                System.out.print("Please input the length: ");
                length = input.nextInt();
                areaCalc(length, area);
                break;

                case 3:
                System.out.print("Please input the length: ");
                length = input.nextInt();
                periCalc(length, pmeter);
                break;

                case 4:
                System.out.println("Exit successful.");
                return;

                default:
                System.out.println("Invalid input.");
                return;
            }
        }
    }

    public static void volCalc (int length, int vol) {
        int result = 0;
        result = length * length * length;
        System.out.println("Volume: " + result);
    }

    public static void areaCalc (int length, int area) {
        int result = 0;
        result = 6 * (length * length);
        System.out.println("Surface Area: " + result);
    }

    public static void periCalc (int length, int pmeter) {
        int result = 0;
        result = 12 * length;
        System.out.println("Perimeter: " + result);
    }
}
