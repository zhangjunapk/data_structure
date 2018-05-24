package stack;

/**
 * 模拟栈 后进先出
 * @author 张君
 */
public class Stack<T> {
    Node<T> last=new Node<>();
    public T pop(){
        //将最后一个弹出
        //断线
        Node<T> result=last;
        Node<T> next = last.getNext();
        last.setNext(null);
        last=next;
        return result.getValue();

    }
    //推进去 连线
    public T push(T t){
        Node<T> node=new Node<>(t);
        node.setNext(last);
        last=node;
        return t;
    }
    public boolean hasNext(){
        return last!=null;
    }
    public T next(){
        Node<T> result=last;
        last=last.getNext();
        return result.getValue();
    }

}
