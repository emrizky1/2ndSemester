public class AcademicMains {

    public static void main(String[] args) {
        Evaluation eval[] = new Evaluation[5];
        eval[0] = new Evaluation();
        eval[0].std = new Students("22001", "Ali Rahman");
        eval[0].crs = new Course("MK001", "Data Structure", 6);

        eval[1] = new Evaluation();
        eval[1].std = new Students("22001", "Ali Rahman");
        eval[1].crs = new Course("2202", "Basis Data", 8);

        eval[2] = new Evaluation();
        eval[2].std = new Students("22003", "Citra Dewi");
        eval[2].crs = new Course("MK003", "Web Design", 6);
    }
    
    public void showAllStudentData(Evaluation[] eval){
        for (Evaluation evaluation : eval) {
            System.out.println("============== Students Data ==============");
            evaluation.std.printStudents();
        }
    }
}