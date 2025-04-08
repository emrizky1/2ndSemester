public class SortingMain20 {
    public static void main(String[] args) {
        int[] a = {34, 7, 23, 32, 5, 62};
        int[] b = {30, 20, 2, 8, 14};
        int[] c = {40, 10, 4, 9, 3};
        Sorting20 sorting = new Sorting20(a);
        Sorting20 sorting2 = new Sorting20(b);
        Sorting20 sorting3 = new Sorting20(c);

        System.out.println("Original array:");
        sorting.print();
        sorting.bubbleSort();
        System.out.println("Sorted array (bubble sort):");
        sorting.print();

        System.out.println("Original array:");
        sorting2.print();
        sorting2.selectionSort();
        System.out.println("Sorted array (Selection sort):");
        sorting2.print();

        System.out.println("Original array:");
        sorting3.print();
        sorting3.insertionSort();
        System.out.println("Sorted array (insertion sort):");
        sorting3.print();
    }
}