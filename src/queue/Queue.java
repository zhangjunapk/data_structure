package queue;

/**
 * 队列简单模拟
 * @author 张君
 */
public class Queue<T> {
    private Node<T> first=new Node<>();
    private Node<T> last=first;
    private Node<T> cursor=first;

    /**
     * 弹出节点，让他们线断掉
     * @return
     */
    public Node<T> pull(){
        Node<T> result=last;
        if(last.getLast()!=null){
            last=last.getLast();
        }
        return result;
    }

    /**
     * 推进去，连线
     * @param t
     * @return
     */
    public Node<T> push(Node<T> t){
        last.next=t;
        t.last=last;
        last=t;
        return t;
    }

    /**
     * 判断是否有下一个
     * @return
     */
    public boolean hasNext(){
        return cursor!=null;
    }

    /**
     * 获得下一个
     * @return
     */
    public Node<T> next(){
        Node<T> resuslt=cursor;
        cursor=cursor.next;
        return resuslt;
    }

}
