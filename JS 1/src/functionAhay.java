public class functionAhay {
    public static void main(String[] args) {
        int[][] dodolBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };  
        int[] regoBunga = {75000, 50000, 60000, 10000};

        incomeEach(dodolBunga, regoBunga);
        stockManagement(dodolBunga);
    }
    public static void incomeEach(int[][] dodolBunga, int[] regoBunga) {
        for (int i = 0; i < dodolBunga.length; i++) {
            int totalInc = 0;
            for (int j = 0; j <dodolBunga[i].length; j++) {
                totalInc += dodolBunga[i][j] * regoBunga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + " income: " + totalInc);
        }
    }
    public static void stockManagement(int[][] dodolBunga) {
        int[] reduction = {1, 2, 0, 5};
        String[] flowersName = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

        for (int i = 0; i < dodolBunga.length; i++) {
            int plisBisa = dodolBunga[3][i] - reduction[i];
            System.out.println("The stock for " + flowersName[i] + " is: " + plisBisa);
        }
    }
}
