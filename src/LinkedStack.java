public class LinkedStack<T> {
    private Node<T> top;
    private int size = 0;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedStack() {
        this.top = null;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() {
        if (top == null) {
            return null;
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }
    public T top() {
        if (top == null) {
            return null;
        }
        return top.data;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public int size() {
        return size;
    }


public static void main(String[] args) {
    LinkedStack<Integer> stack = new LinkedStack<>();
    stack.push(6);
    stack.push(9);
    stack.push(3);
    System.out.println(stack.pop());
    System.out.println(stack.size());
    }
}

