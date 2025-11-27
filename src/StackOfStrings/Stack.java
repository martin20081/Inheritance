package StackOfStrings;

import java.util.ArrayList;

public class Stack {

    private ArrayList<String> data;

    public Stack() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return this.data.remove(this.data.size() - 1);
    }

    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return this.data.get(this.data.size() - 1);
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }
}
