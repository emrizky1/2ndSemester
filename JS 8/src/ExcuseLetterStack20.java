public class ExcuseLetterStack20 {
    ExcuseLetter20[] stack;
    int top, size;

    public ExcuseLetterStack20() {

    }

    public ExcuseLetterStack20 (int size) {
        this.size = size;
        top = -1;
        stack = new ExcuseLetter20[size];
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(ExcuseLetter20 letter) {
        if (!isFull()) {
            stack[++top] = letter;
        } else {
            System.out.println("Stack full! Cannot submit new excuse letter.");
        }
    }

    ExcuseLetter20 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("No letter to process.");
            return null;
        }
    }

    ExcuseLetter20 peek() {
        if (!isEmpty()) {
            ExcuseLetter20 letter = stack[top];
            String type = (letter.typeOfExcuse == 'S' || letter.typeOfExcuse == 's') ? "Sick" : "Other";
            System.out.println("Latest letter from: " + letter.name);
            System.out.println("Type of excuse: " + type);
            return letter;
        } else {
            System.out.println("No letters submitted yet.");
            return null;
        }
    }

    ExcuseLetter20 searchByName(String name) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].name.equalsIgnoreCase(name)) {
                return stack[i];
            }
        }
        return null;
    }

}
