import java.util.Scanner;

public class gradingSystem {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String aGrade;
        boolean isPass = true;

        System.out.println("Final Score Calculation Progran");
        System.out.println("===============================");
        System.out.print("Input Assignment Score: ");
        int aScore = input.nextInt();
        System.out.print("Input Quiz Score: ");
        int qScore = input.nextInt();
        System.out.print("Input Midterm Score: ");
        int mScore = input.nextInt();
        System.out.print("Input Final-test Score: ");
        int fScore = input.nextInt();
        System.out.println("===============================");
        System.out.println("===============================");
        if (aScore > 100 || qScore > 100 || mScore > 100 || fScore > 100 || qScore < 0 || mScore < 0 || aScore < 0 || fScore < 0) {
            System.out.println("Invalid score. Please try again.");
        } else {
            double finalScore = (aScore * 0.2) + (qScore * 0.2) + (mScore * 0.3) + (fScore * 0.3);
            if (finalScore > 80 && finalScore <= 100) {
                aGrade = "A";
            } else if (finalScore > 73 && finalScore <= 80) {
                aGrade = "B+";
            } else if (finalScore > 65 && finalScore <= 73) {
                aGrade = "B";
            } else if (finalScore > 60 && finalScore <= 65) {
                aGrade = "C+";
            } else if (finalScore > 50 && finalScore <= 60) {
                aGrade = "C";
            } else if (finalScore > 39 && finalScore <= 50) {
                aGrade = "D";
            } else {
                aGrade = "E";
            }

            if (aGrade == "D" || aGrade == "E") {
                isPass = false;
            }
            System.out.println("Final Score = " + finalScore);
            System.out.println("Grade Score = " + aGrade);
            System.out.println("===============================");
            System.out.println("===============================");
            if (isPass == true) {
                System.out.println("Congratulations! You passed");
            } else {
                System.out.println("You failed.");
            }
        }

        
    }
}