public class SortMain {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] data = {10, 40, 30, 50, 70, 20, 100, 90};

        System.out.println("Sorting with merge sort");
        System.out.println("Initial Data");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        
        mergeSort.sort(data, 0, data.length - 1);
        
        System.out.println("Sorted Data");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
