public class Student {
    String name, nim, year;
    int midterm, finalterm;

    public Student() {

    }

    public Student(String n, String nim, String y, int mt, int ft) {
        name = n;
        this.nim = nim;
        year = y;
        midterm = mt;
        finalterm = ft;
    }

    static int highestMidterm(Student[] arr, int l, int r) {
        if (l==r) {
            return arr[l].midterm;
        } else {
            int mid = (l+r) / 2;
            int lm = highestMidterm(arr, l, mid);
            int rm = highestMidterm(arr, mid+1, r);
            if (lm > rm) {
                return lm;
            } else {
                return rm;
            }
        }
    }

    static int lowestMidterm(Student[] arr, int l, int r) {
        if (l==r) {
            return arr[l].midterm;
        } else {
            int mid = (l+r) / 2;
            int lm = lowestMidterm(arr, l, mid);
            int rm = lowestMidterm(arr, mid+1, r);
            if (lm < rm) {
                return lm;
            } else {
                return rm;
            }
        }
    }

    static double averageFinalterm(Student[] studentArray) {
        int total = 0;
        int ms = 0;
        for (int i = 0; i < studentArray.length; i++) {
            total = studentArray[i].finalterm + total;
            ms++;
        }
        double average = (double) total / (double) ms;
        return average;
    }
}
