import java.util.Scanner;

public class gpaCalculation {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String[] course = {"Pancasila", "KTI", "CTPS", "MatDas", "Bahasa Inggris", "DasPro", "PrakDasPro", "K3"};
        int[] sks = {2, 2, 2, 3, 2, 2, 3, 2};
        int totCourse = course.length;

        int[] score = new int[totCourse];
        String[] alphaScore = new String[totCourse];
        double[] gradeScore = new double [totCourse];

        System.out.println("==============================");
        System.out.println("IP Semester Calculator Program");
        System.out.println("==============================");

        for (int i = 0; i < totCourse; i++) {
            System.out.print("Input numerical grade for " + course[i] + ": ");
            score[i] = input.nextInt();
            alphaScore[i] = convertAlphaScore(score[i]);
            gradeScore[i] = convertGradeScore(alphaScore[i]);
        }

        double totPoint = 0;
        double totSks = 0;

        for (int i = 0; i < totCourse; i++) {
            totPoint += gradeScore[i] * sks[i];
            totSks += sks[i];
        }
        System.out.println("==============================");
        System.out.println("Conversion Result");
        System.out.println("==============================");
        
        System.out.printf("%-40s %-12s %-12s %-12s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < totCourse; i++) {
            System.out.printf("%-40s %-12s %-12s %-12s\n", course[i], score[i], alphaScore[i], gradeScore[i]);
        }
        
        System.out.println("==============================");
        double hasilAkhir = totPoint / totSks;
        System.out.printf("GPA: %.2f", hasilAkhir);

        input.close();
    }

    public static String convertAlphaScore (double score) {
        if (80 < score && 100 >= score) {
            return "A";
        } else if (score > 73 && score <= 80) {
            return "B+";
        } else if (score > 65 && score <= 73) {
            return "B";
        } else if (score > 60 && score <= 65) {
            return "C+";
        } else if (score > 50 && score <= 60) {
            return "C";
        } else if (score > 39 && score <= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    public static double convertGradeScore (String alphaScore) {
        if (alphaScore.equals("A")) {
            return 4.0;
        } else if (alphaScore.equals("B+")) {
            return 3.5;
        } else if (alphaScore.equals("B")) {
            return 3.0;
        } else if (alphaScore.equals("C+")) {
            return 2.5;
        } else if (alphaScore.equals("C")) {
            return 2.0;
        } else if (alphaScore.equals("D")) {
            return 1.0;
        } else {
            return 0;
        }
    }
}
