package hashmap;

public class Node<K,V> {
    Node<K,V> last;
    K key;
    V value;
    Node<K,V> next;

    public Node() {
    }

    public Node<K, V> getLast() {
        return last;
    }

    public void setLast(Node<K, V> last) {
        this.last = last;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node<K, V> getNext() {
        return next;
    }

    public void setNext(Node<K, V> next) {
        this.next = next;
    }

    public Node(Node<K, V> last, K key, V value, Node<K, V> next) {
        this.last = last;
        this.key = key;
        this.value = value;
        this.next = next;
    }
}
