public class KRSQueue {
    Student[] data;
    int front, rear, size, max;
    int totalApproved = 0;
    final int maxApproved = 30;

    public KRSQueue(int n) {
        max = n;
        data = new Student[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Queue cleared.");
    }

    public void enqueue(Student s) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = s;
        size++;
        System.out.println(s.name + " is added to the KRS queue.");
    }

    public void processKRSApproval() {
        if (size < 2) {
            System.out.println("Not enough students to process (need 2).");
            return;
        }
        if (totalApproved + 2 > maxApproved) {
            System.out.println("Maximum students approved reached (" + maxApproved + ").");
            return;
        }

        System.out.println("Processing 2 students:");
        for (int i = 0; i < 2; i++) {
            Student s = data[front];
            s.print();
            front = (front + 1) % max;
            size--;
            totalApproved++;
        }
    }

    public void showAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("All students in the queue:");
        int i = front;
        for (int count = 0; count < size; count++) {
            data[i].print();
            i = (i + 1) % max;
        }
    }

    public void showFirstTwo() {
        if (size == 0) {
            System.out.println("Queue is empty!");
        } else if (size == 1) {
            System.out.println("Only 1 student in the queue:");
            data[front].print();
        } else {
            System.out.println("First two students in the queue:");
            data[front].print();
            data[(front + 1) % max].print();
        }
    }

    public void showLast() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Last student in the queue:");
            data[rear].print();
        }
    }

    public void showStats() {
        System.out.println("Total students in queue: " + size);
        System.out.println("Total approved: " + totalApproved);
        System.out.println("Remaining: " + (maxApproved - totalApproved));
    }
}
