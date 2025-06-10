public class BinaryTreeArray20 {
    Student20[] data;
    int idxLast;
    public BinaryTreeArray20(){
        data = new Student20[10];
        idxLast = -1;
    }

    void populateData(Student20[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if(idxStart <= idxLast) {
            if(data[idxLast] != null) {
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void add(Student20 newData) {
        if(idxLast == data.length - 1) {
            System.out.println("Tree is full!");
            return;
        }
        if(idxLast == -1) {
            data[0] = newData;
            idxLast = 0;
        } else {
            int current = 0;
            while(true) {
                if(newData.ipk < data[current].ipk) {
                    if(data[2 * current + 1] == null) {
                        data[2 * current + 1] = newData;
                        int idxNew = 2 * current + 1;
                        if(idxNew > idxLast) {
                            idxLast = idxNew;
                        }
                        break;
                    } else {
                        current = 2 * current + 1;
                    }
                } else if(newData.ipk > data[current].ipk) {
                    if(data[2 * current + 2] == null) {
                        data[2 * current + 2] = newData;
                        int idxNew = 2 * current + 2;
                        if(idxNew > idxLast) {
                            idxLast = idxNew;
                        }
                        break;
                    } else {
                        current = 2 * current + 2;
                    }
                } else {
                    System.out.println("Data already exist!");
                    break;
                }
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if(idxStart <= idxLast) {
            if(data[idxLast] != null) {
                data[idxStart].print();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
