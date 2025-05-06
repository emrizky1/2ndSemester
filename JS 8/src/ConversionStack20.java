public class ConversionStack20 {
    int[] binaryStack;
    int size;
    int top;

    public ConversionStack20() {
        this.size = 32;
        top = -1;
        binaryStack = new int[size];
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int data) {
        if(!isFull()) {
            top++;
            binaryStack[top] = data;
        } else {
            System.out.println("Stack is already full!");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is still empty!");
            return -1;
        } else{
            int data = binaryStack[top];
            top--;
            return data;
        }
    }
}