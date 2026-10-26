package main;

import java.util.ArrayList;
import java.util.Scanner;

class MyStack extends ArrayList<Object> {
    private static final long serialVersionUID = 1L;

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return size();
    }

    public Object peek() {
        return get(getSize() - 1);
    }

    public Object pop() {
        Object o = get(getSize() - 1);
        remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        add(o);
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack stack = new MyStack();

        System.out.print("Enter five strings: ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }

        System.out.println("Displaying strings in reverse order:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        input.close();
    }
}