public class BinaryTreeArrayMain20 {
    public static void main(String[] args) {
        BinaryTreeArray20 bta = new BinaryTreeArray20();
        Student20 m1 = new Student20("244107020138", "Devin", "TI-1I", 3.57);
        Student20 m2 = new Student20("244107020023", "Dewi", "TI-1I", 3.85);
        Student20 m3 = new Student20("244107020225", "Wahyu", "TI-1I", 3.21);
        Student20 m4 = new Student20("244107020076", "Angelina", "TI-1I", 3.54);
        Student20 m5 = new Student20("244107020223", "Andhika", "TI-1I", 3.72);
        Student20 m6 = new Student20("244107020226", "Bima", "TI-1I", 3.37);
        Student20 m7 = new Student20("244107020181", "Eiyu", "TI-1I", 3.46);

        Student20[] data = {m1, m2, m3, m4, m5, m6, m7};
        bta.populateData(data, data.length - 1);
        System.out.println("In-Order traversal:");
        bta.traverseInOrder(0);
        System.out.println("Pre-Order traversal");
        bta.traversePreOrder(0);
    }
}
