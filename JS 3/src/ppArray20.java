import java.util.Scanner;

public class ppArray20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.print("Input length of the array: ");
        size = sc.nextInt();
        Rectangle20[] rectangleArray = new Rectangle20[size];

        for (int i = 0; i < size; i++) {
            rectangleArray[i] = new Rectangle20();
            System.out.println("Rectangle: " + i);

            System.out.print("Input length: ");
            rectangleArray[i].length = sc.nextInt();

            System.out.print("Input width: ");
            rectangleArray[i].width = sc.nextInt();
        }


        for (int i = 0; i < size; i++) {
            System.out.println("Rectangle: " + i);
            System.out.println("width: " + rectangleArray[i].width + " Length: " + rectangleArray[i].length);
        }
    }
}


