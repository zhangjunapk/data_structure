package queue;

public class Node<T>{
    Node<T> last;
    T val;
    Node<T> next;

    public Node() {
    }

    public Node(Node<T> last, T val, Node<T> next) {
        this.last = last;
        this.val = val;
        this.next = next;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }


}
