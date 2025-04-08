public class LecturerData20 {
    Lecturer20[] lecturerData;
    int idx;

    public LecturerData20() {

    }

    public LecturerData20(int size) {
        lecturerData = new Lecturer20[size];
    }

    public void add(Lecturer20 lct) {
        if (idx < lecturerData.length) {
            lecturerData[idx] = lct;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            lecturerData[i].print();
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < idx; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer20 temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < idx; i++) {
            int minIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (lecturerData[j].age > lecturerData[minIndex].age) {
                    minIndex = j;
                }
            }
            Lecturer20 temp = lecturerData[minIndex];
            lecturerData[minIndex] = lecturerData[i];
            lecturerData[i] = temp;
        }
    }

    public void insertionSort() {
        for (int i = 0; i < idx; i++) {
            Lecturer20 temp = lecturerData[i];
            int j = i;
            while (j >= 0 && lecturerData[j].age > temp.age) {
                lecturerData[j] = lecturerData[j - 1];
                j--;
            }
            lecturerData[j] = temp;
        }
    }

    public int findSeqSearch(String search) {
        int position = -1;
        for (int i = 0; i < lecturerData.length; i++) {
            if (lecturerData[i].name.equalsIgnoreCase(search)) {
                position = i;
                break;
            }
        }
        return position;
    }

    public void showPosition(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " is found in index-" + pos);
        } else {
            System.out.println("Data : " + x + " is not found");
        }
    }

    public void showData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Name \t : " + x);
            System.out.println("ID \t : " + lecturerData[pos].id);
            System.out.println("Age \t : " + lecturerData[pos].age);
            System.out.println("Gender \t : " + lecturerData[pos].gender);
        } else {
            System.out.println("Data " + x + " is not found");
        }
    }
}
