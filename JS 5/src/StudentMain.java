public class StudentMain {
    public static void main(String[] args) {
        Student[] studentArray = new Student[8];

        studentArray[0] = new Student("Ahmad", "220101001", "2022", 78, 82);
        studentArray[1] = new Student("Budi", "220101002", "2022", 85, 88);
        studentArray[2] = new Student("Cindy", "220101003", "2021", 90, 87);
        studentArray[3] = new Student("Dian", "220101004", "2021", 76, 79);
        studentArray[4] = new Student("Eko", "220101005", "2023", 92, 95);
        studentArray[5] = new Student("Fajar", "220101006", "2020", 88, 85);
        studentArray[6] = new Student("Gina", "220101007", "2023", 80, 83);
        studentArray[7] = new Student("Hadi", "220101008", "2020", 82, 84);

        System.out.printf("%-10s %-20s %-20s %-20s %-20s%n","Name", "Student ID (NIM)", "Year of Admission", "Midterm Score (UTS)", "Final Score (UAS)");
        System.out.println("-------------------------------------------------------------------------------");
        for (Student s : studentArray) {
            System.out.printf("%-10s %-20s %-20s %-20s %-20s%n", s.name, s.nim, s.year, s.midterm, s.finalterm);
        }
        
        System.out.println("The highest midterm score is: " + Student.highestMidterm(studentArray, 0, studentArray.length-1));
        System.out.println("The lowest midterm score is: " + Student.lowestMidterm(studentArray, 0, studentArray.length-1));
        System.out.println("The average final term score is: " + Student.averageFinalterm(studentArray));
    }
}
