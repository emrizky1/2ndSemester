public class TopStudent20 {
    Student20[] listStudent;
    int idx;

    public TopStudent20() {

    }

    public TopStudent20(int size) {
        listStudent = new Student20[size];
    }

    public void add(Student20 student) {
        if (idx < listStudent.length) {
            listStudent[idx] = student;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            listStudent[i].print();
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < idx; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listStudent[j].gpa < listStudent[j + 1].gpa) {
                    Student20 temp = listStudent[j];
                    listStudent[j] = listStudent[j + 1];
                    listStudent[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < idx; i++) {
            int minIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (listStudent[j].gpa < listStudent[minIndex].gpa) {
                    minIndex = j;
                }
            }
            Student20 temp = listStudent[minIndex];
            listStudent[minIndex] = listStudent[i];
            listStudent[i] = temp;
        }
    }

    public void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Student20 temp = listStudent[i];
            int j = i;
            while (j > 0 && listStudent[j - 1].gpa > temp.gpa) {
                listStudent[j] = listStudent[j - 1];
                j--;
            }
            listStudent[j] = temp;
        }
    }

    public void insertionSortDes() {
        for (int i = 1; i < idx; i++) {
            Student20 temp = listStudent[i];
            int j = i;
            while (j > 0 && listStudent[j - 1].gpa < temp.gpa) {
                listStudent[j] = listStudent[j - 1];
                j--;
            }
            listStudent[j] = temp;
        }
    }
}
