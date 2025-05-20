public class StudentQueue {
    NNode head, tail;
    int size;
    int max = 5;

    public StudentQueue() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = tail = null;
        size = 0;
        System.out.println("Queue cleared.");
    }

    public void enqueue(NStudent student) {
        if (size==max) {
            System.out.println("Queue is full!");
            return;
        }

        NNode newNode = new NNode(student);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Student added to queue.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.print("A student left the queue: ");
        head.data.print();
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        NNode temp = head;
        System.out.println("Students in queue:");
        while (temp != null) {
            temp.data.print();
            temp = temp.next;
        }
    }

    public void printFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Front: ");
        head.data.print();
    }

    public void printRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Rear: ");
        tail.data.print();
    }

    public int total() {
        return size;
    }
}
