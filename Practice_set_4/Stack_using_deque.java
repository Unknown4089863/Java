import java.util.*;

public class Stack_using_deque {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}

class Stack<T> {

    private Deque<T> deque = new ArrayDeque<>();

    void push(T a) {
        deque.addFirst(a);
    }

    T pop() {
        if (deque.isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        return deque.removeFirst();
    }

    T peek() {
        if (deque.isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        return deque.getFirst();
    }

    boolean isEmpty() {
        return deque.isEmpty();
    }

    int size() {
        return deque.size();
    }

    @Override
    public String toString() {
        return "Stack : " + deque.toString();
    }

}