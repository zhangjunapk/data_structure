package stack;

public class Node<T> {
    private T value;
    private Node<T> next;

    public Node() {
    }

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }
}
