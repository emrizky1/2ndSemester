public class DoubleLinkedList {
    Node head;
    Node tail;

    DoubleLinkedList() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head==null;
    }

    void addFirst(Student data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            head = tail = newNode;
        } else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(Student data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            head = tail = newNode;
        } else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void insertAfter(String key, Student data) {
        Node newNode = new Node(data);
        Node temp = head;
        while(temp != null) {
            if(temp.data.nim.equalsIgnoreCase(key)) {
                if (temp == tail) {
                    addLast(data);
                } else{
                    newNode.next = temp.next;
                    newNode.prev = temp;
                    temp.next.prev = newNode;
                    temp.next = newNode;
                }
                break;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Insertion failed. Data (" + key + ") not found!");
        }
    }

    void print() {
        if(!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
            System.out.println("");
        } else{
            System.out.println("Double linked list is currently empty!");
        }
    }

    void removeFirst() {
        if(isEmpty()) {
            System.out.println("Double Linked list is currently empty!");
        } else if(head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void removeLast() {
        if(isEmpty()) {
            System.out.println("Double Linked list is currently empty!");
        } else if(head == tail){
            head = tail = null;
        } else{
            tail = tail.prev;
            tail.next = null;
        }
    }

    void remove(int index) {
        if(isEmpty()) {
            System.out.println("Double Linked list is currently empty!");
        } else if(index == 0) {
            removeFirst();
        } else{
            Node temp = head;
            for(int i = 0; i < index; i++) {
                temp = temp.next;
            }
            if (temp == tail) {
                removeLast();
            }else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
    }

    void add(int index, Student data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            head = tail = newNode;
        } else {
            Node temp = head;
            for(int i = 0; i < index; i++) {
                temp = temp.next;
            }
            if (temp == tail) {
                addLast(data);
            } else if (temp == head) {
                addFirst(data);
            } else{
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next.prev = newNode;
                temp.next = newNode;
            }
        }
    }

    void removeAfter(String key) {
        Node temp = head;
        if(isEmpty()) {
            System.out.println("Double Linked list is currently empty!");
        } else {
            while (temp != null) {
                if(temp.data.nim.equalsIgnoreCase(key)) {
                    if (temp.next == null) {
                        System.out.println("No data that can be deleted");
                    } else{
                        if(temp.next.next != null) {
                            temp.next.next.prev = temp;
                        } else{
                            tail = temp;
                        }
                    }
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }
        }
        if(temp == null) {
            System.out.println("Data with nim " + key + " does not exist.");
        }
    }

    Student getFirst() {
        if(!isEmpty()) {
            return head.data;
        } else{
            return null;
        }
    }

    Student getLast() {
        if(!isEmpty()) {
            return tail.data;
        } else{
            return null;
        }
    }

    Student getIndex(String key) {
        if(!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                if(temp.data.nim.equalsIgnoreCase(key)) {
                    return temp.data;
                }
                temp = temp.next;
            }
        }
            return null;
    }

    int getSize(){
        int size = 0;
        Node temp = head;
        while (temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }

    int indexOf(String key) {
        Node temp = head;
        if(isEmpty()) {
            return -1;
        } else{
            int idx = 0;
            while(temp != null) {
                if(temp.data.nim.equalsIgnoreCase(key)) {
                    return idx;
                }
                idx++;
                temp = temp.next;
            }
        }
            return -1;
    }
}
